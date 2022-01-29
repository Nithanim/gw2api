package me.nithanim.gw2api.v2.util.reflect;

public class ReflectUtil {
  private ReflectUtil() {}

  // thanks to the discussion here:
  // http://stackoverflow.com/questions/13392160/about-java-get-string-class-from-string-class-what-if-string-class-is
  public static <T> Class<T[]> getArrayClass(Class<T> clazz) {
    try {
      return (Class<T[]>) Class.forName("[L" + clazz.getName() + ";");
    } catch (ClassNotFoundException ex) {
      throw new RuntimeException(
          "Unable to find array type for generic type " + clazz.getName(), ex);
    }
  }
}
