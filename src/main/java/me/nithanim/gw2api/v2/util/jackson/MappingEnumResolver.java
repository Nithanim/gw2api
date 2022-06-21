package me.nithanim.gw2api.v2.util.jackson;

import java.util.HashMap;
import java.util.function.Function;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.util.EnumResolver;

/**
 * Effectively the default {@link EnumResolver} but with a custom creation logic that accepts a
 * custom mapper for the json name.
 */
public class MappingEnumResolver extends EnumResolver {
  public static EnumResolver create(
      DeserializationConfig config, Class<?> enumClass, Function<Enum<?>, String> mapper) {
    // More or less copied form the base class because there is no way to hook into the naming
    AnnotationIntrospector ai = config.getAnnotationIntrospector();
    final Class<Enum<?>> enumCls = _enumClass(enumClass);
    final Enum<?>[] enumConstants = _enumConstants(enumClass);
    HashMap<String, Enum<?>> map = new HashMap<>();
    final String[][] allAliases = new String[enumConstants.length][];
    ai.findEnumAliases(enumCls, enumConstants, allAliases);

    // from last to first, so that in case of duplicate values, first wins
    for (int i = enumConstants.length; --i >= 0; ) {
      Enum<?> enumValue = enumConstants[i];
      map.put(mapper.apply(enumValue), enumValue);
      String[] aliases = allAliases[i];
      if (aliases != null) {
        for (String alias : aliases) {
          map.putIfAbsent(alias, enumValue);
        }
      }
    }
    return new MappingEnumResolver(enumCls, enumConstants, map, _enumDefault(ai, enumCls), false);
  }

  protected MappingEnumResolver(
      Class<Enum<?>> enumClass,
      Enum<?>[] enums,
      HashMap<String, Enum<?>> map,
      Enum<?> defaultValue,
      boolean isIgnoreCase) {
    super(enumClass, enums, map, defaultValue, isIgnoreCase);
  }
}
