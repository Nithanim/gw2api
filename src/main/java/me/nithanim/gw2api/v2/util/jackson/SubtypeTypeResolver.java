package me.nithanim.gw2api.v2.util.jackson;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class SubtypeTypeResolver<T> extends TypeIdResolverBase {
  private final Map<String, JavaType> map;

  public SubtypeTypeResolver(Class<? extends SubtypeEnum<T>> e) {
    this.map = new HashMap<>();
    TypeFactory typeFactory = TypeFactory.defaultInstance();
    for (SubtypeEnum<?> value : e.getEnumConstants()) {
      Class<?> subtype = value.getEnumClass();
      if (subtype != null) {
        map.put(toJsonName(value.name()), typeFactory.constructType(subtype));
      }
    }
  }

  @Override
  public JsonTypeInfo.Id getMechanism() {
    return JsonTypeInfo.Id.NAME;
  }

  @Override
  public void init(JavaType baseType) {}

  @Override
  public JavaType typeFromId(DatabindContext context, String id) throws IOException {
    return map.get(id);
  }

  @Override
  public String idFromValue(Object value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public String idFromValueAndType(Object value, Class<?> suggestedType) {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getDescForKnownTypeIds() {
    return String.join(",", map.keySet());
  }

  private static String fromJsonName(String name) {
    StringBuilder sb = new StringBuilder();
    sb.append(name);
    for (int i = 0; i < sb.length(); i++) {
      char c = sb.charAt(i);
      if (Character.isUpperCase(c)) {
        sb.setCharAt(i, '_');
        sb.insert(i + 1, Character.toLowerCase(c));
      }
    }
    return sb.toString();
  }

  private static String toJsonName(String name) {
    StringBuilder sb = new StringBuilder(name.length());
    boolean uppercase = true;
    for (int i = 0; i < name.length(); i++) {
      char c = name.charAt(i);
      if (c == '_') {
        uppercase = true;
      } else if (uppercase) {
        sb.append(c);
        uppercase = false;
      } else {
        sb.append(Character.toLowerCase(c));
      }
    }
    return sb.toString();
  }
}
