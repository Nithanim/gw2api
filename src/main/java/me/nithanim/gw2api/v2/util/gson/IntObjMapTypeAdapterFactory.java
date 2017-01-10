package me.nithanim.gw2api.v2.util.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import me.nithanim.gw2api.v2.util.collections.IntObjMap;
import me.nithanim.gw2api.v2.util.reflect.LibraryAvailabilityChecker;
import me.nithanim.gw2api.v2.util.mappings.IntMappable;

public class IntObjMapTypeAdapterFactory implements TypeAdapterFactory {
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        if (!LibraryAvailabilityChecker.checkKoloboke()) {
            return null;
        }

        //We can only handle our map
        if (!IntObjMap.class.isAssignableFrom(type.getRawType())) {
            return null;
        }

        //We can only read our own dataholder
        if (!ParameterizedType.class.isAssignableFrom(type.getType().getClass())) {
            return null;
        }

        //Get the type between the <>
        Type genericType = ((ParameterizedType) type.getType()).getActualTypeArguments()[0];
        final TypeAdapter<?> genericTypeAdapter = gson.getAdapter(TypeToken.get(genericType));

        //We need to know what field to use as key for the map
        //Could potentially be replaced by lambda/method ref that give the id
        if (!IntMappable.class.isAssignableFrom((Class) genericType)) {
            throw new IllegalArgumentException(
                "Generic type " + genericType
                + " used in " + IntObjMap.class
                + " has to implement " + IntMappable.class
                + " to know what field to use as key!"
            );
        }

        return new TypeAdapter<T>() {
            @Override
            public void write(JsonWriter out, T value) throws IOException {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            @SuppressWarnings("unchecked")
            public T read(JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                } else {
                    IntObjMap<Object> map = IntObjMap.withExpectedSize(10);

                    if (in.peek() == JsonToken.BEGIN_ARRAY) {
                        in.beginArray();
                        while (in.hasNext()) {
                            IntMappable im = (IntMappable) genericTypeAdapter.read(in);
                            map.put(im.getMappableId(), im);
                        }
                        in.endArray();
                    } else if (in.peek() == JsonToken.BEGIN_OBJECT) {
                        in.beginObject();
                        while (in.hasNext()) {
                            in.nextName(); //discard key that is the same as object id
                            IntMappable im = (IntMappable) genericTypeAdapter.read(in);
                            map.put(im.getMappableId(), im);
                        }
                        in.endObject();
                    } else {
                        throw new IllegalStateException("Can't handle " + in.peek());
                    }
                    return (T) map;
                }
            }
        };
    }
}
