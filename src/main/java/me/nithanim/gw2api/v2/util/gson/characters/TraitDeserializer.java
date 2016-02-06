package me.nithanim.gw2api.v2.util.gson.characters;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * Since the int[] can include null elements in json, a custom deserializer is
 * needed that populates all fields that are not a valid int with -1.
 */
public class TraitDeserializer extends TypeAdapter<int[]> {

    @Override
    public int[] read(JsonReader in) throws IOException {
        int[] arr = new int[3];
        int elements;
        in.beginArray();
        for (elements = 0; in.hasNext(); elements++) {
            if (elements >= arr.length) {
                arr = Arrays.copyOf(arr, arr.length * 2);
            }
            if (in.peek() == JsonToken.NUMBER) {
                arr[elements] = in.nextInt();
            } else {
                arr[elements] = -1;
                in.skipValue();
            }
        }
        if (arr.length != elements) {
            in.endArray();
            return Arrays.copyOf(arr, elements);
        } else {
            in.endArray();
            return arr;
        }
    }

    @Override
    public void write(JsonWriter out, int[] value) throws IOException {
        throw new UnsupportedOperationException();
    }

}
