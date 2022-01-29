package me.nithanim.gw2api.v2.util.gson;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import me.nithanim.gw2api.v2.api.achievements.DailyAchievement;
import me.nithanim.gw2api.v2.api.characters.SpecializationType;

public class EnumTypeAdapterFactory implements TypeAdapterFactory {
  private static <T> String toCamelCase(T e) {
    StringBuilder sb = new StringBuilder(e.toString().toLowerCase());
    sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));

    int underscore;
    while ((underscore = sb.indexOf("_")) != -1) {
      sb.setCharAt(underscore + 1, Character.toUpperCase(sb.charAt(underscore + 1)));
      sb.deleteCharAt(underscore);
    }
    return sb.toString();
  }

  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    @SuppressWarnings("unchecked")
    Class<T> rawType = (Class<T>) type.getRawType();
    if (!rawType.isEnum()) {
      return null;
    }

    final Map<String, T> map = new HashMap<>();
    for (T constant : rawType.getEnumConstants()) {
      if (rawType == SpecializationType.class || rawType == DailyAchievement.Type.class) {
        // Only this two enums are returned in lowercase by the api
        // every other in camelcase.
        map.put(constant.toString().toLowerCase(), constant);
      } else {
        map.put(toCamelCase(constant), constant);
      }
    }

    return new TypeAdapter<T>() {
      @Override
      public void write(JsonWriter out, T value) throws IOException {
        out.value(value == null ? null : toCamelCase(value));
      }

      @Override
      public T read(JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
          in.nextNull();
          return null;
        } else {
          return map.get(in.nextString());
        }
      }
    };
  }
}
