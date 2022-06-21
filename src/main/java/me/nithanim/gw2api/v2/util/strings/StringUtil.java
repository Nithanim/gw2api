package me.nithanim.gw2api.v2.util.strings;

import java.util.Arrays;

import lombok.experimental.UtilityClass;

@UtilityClass
public class StringUtil {
  public static String upperToPascalCase(String s) {
    return Arrays.stream(s.split("_"))
        .collect(
            StringBuilder::new,
            (result, w) ->
                result.append(w.substring(0, 1).toUpperCase()).append(w.substring(1).toLowerCase()),
            StringBuilder::append)
        .toString();
  }
}
