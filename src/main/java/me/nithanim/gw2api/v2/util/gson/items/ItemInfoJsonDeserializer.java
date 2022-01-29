package me.nithanim.gw2api.v2.util.gson.items;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import me.nithanim.gw2api.v2.api.items.Details;
import me.nithanim.gw2api.v2.api.items.ItemInfo;
import me.nithanim.gw2api.v2.api.items.ItemType;

public class ItemInfoJsonDeserializer implements JsonDeserializer<ItemInfo> {
  private final Map<String, Field> fields = new HashMap<>();

  public ItemInfoJsonDeserializer() {
    Class<?> clazz = ItemInfo.class;
    while (clazz != null) {
      registerAllFieldsFor(clazz);
      clazz = clazz.getSuperclass();
    }
  }

  private static String toJsonName(String name) {
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

  @Override
  public ItemInfo deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    JsonObject root = json.getAsJsonObject();
    ItemInfo ii = new ItemInfo();
    for (Map.Entry<String, JsonElement> t : root.entrySet()) {
      if (!t.getKey().equals("details")) {
        Field field = fields.get(t.getKey());
        if (field != null) {
          Object value = context.deserialize(t.getValue(), field.getType());
          try {
            field.set(ii, value);
          } catch (IllegalAccessException ex) {
            throw new RuntimeException("Unexpected difficulties while deserializing ItemInfo!", ex);
          }
        }
      }
    }

    ItemType type = ii.getType();
    Class<? extends Details> detailClass = type.getDetailsClass();
    if (detailClass != null) {
      Object details = context.deserialize(root.get("details"), detailClass);
      try {
        Field field = fields.get("details");
        field.set(ii, details);
      } catch (IllegalAccessException ex) {
        throw new RuntimeException("Unable to set Details in ItemInfo while deserializing!", ex);
      }
    }
    return ii;
  }

  private void registerAllFieldsFor(Class clazz) {
    Field[] fs = clazz.getDeclaredFields();
    for (Field f : fs) {
      f.setAccessible(true);
      String name = toJsonName(f.getName());

      Field prev = fields.put(name, f);
      if (prev != null) {
        throw new IllegalStateException(
            "Another field with the name "
                + f.getName()
                + " was already found in "
                + prev.getDeclaringClass()
                + " before reading "
                + clazz);
      }
    }
  }
}
