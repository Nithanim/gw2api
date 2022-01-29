package me.nithanim.gw2api.v2.util.gson;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;

import com.google.gson.InstanceCreator;

/**
 * This is a generic InstanceCreator for {@link EnumMap}s. It works by using a somewhat hackish way
 * to not-specifying the Types and taking advantage of type-erasure. This enables us to use the same
 * InstanceCreator for every {@link EnumMap}, regardless of the type of the enum.
 *
 * @param <K> the enum constant
 * @param <V> the type that the enum is mapped to
 */
public class EnumMapInstanceCreator<K extends Enum<K>, V>
    implements InstanceCreator<EnumMap<K, V>> {
  @Override
  public EnumMap<K, V> createInstance(Type type) {
    if (type instanceof ParameterizedType) {
      ParameterizedType t = (ParameterizedType) type;
      if (t.getActualTypeArguments()[0] instanceof Class) {
        return new EnumMap((Class) t.getActualTypeArguments()[0]);
      } else {
        throw new IllegalArgumentException(
            "The generic "
                + EnumMapInstanceCreator.class.getSimpleName()
                + " can only work with a Class as first Type-üarameter!");
      }
    } else {
      throw new IllegalArgumentException(
          "The generic "
              + EnumMapInstanceCreator.class.getSimpleName()
              + " can only work with a ParameterizedType!");
    }
  }
}
