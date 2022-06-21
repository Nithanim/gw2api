package me.nithanim.gw2api.v2.util.jackson;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.deser.std.EnumDeserializer;
import com.fasterxml.jackson.databind.util.EnumResolver;

public class EnumDeserializers extends Deserializers.Base {
  @Override
  public JsonDeserializer<?> findEnumDeserializer(
      Class<?> type, DeserializationConfig config, BeanDescription beanDesc)
      throws JsonMappingException {

    if (type.isEnum()) {
      EnumResolver byNameResolver =
          MappingEnumResolver.create(config, type, e -> toJsonName(e.name()));
      boolean caseInsensitive = true; // Although most of the stuff is PascalCase, some is lowercase (like "pve"
      return new EnumDeserializer(byNameResolver, caseInsensitive);
    } else {
      return null;
    }
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

  public static class MyModule extends Module {
    @Override
    public String getModuleName() {
      return "Gw2ApiEnumMapping";
    }

    @Override
    public Version version() {
      return Version.unknownVersion();
    }

    @Override
    public void setupModule(SetupContext context) {
      context.addDeserializers(new EnumDeserializers());
    }
  }
}
