package me.nithanim.gw2api.v2;

import java.util.EnumMap;
import java.util.Map;

public enum Language {
  EN,
  ES,
  DE,
  FR,
  ZH;

  private static final Map<Language, String> LOOKUP;

  static {
    LOOKUP = new EnumMap<>(Language.class);
    for (Language language : values()) {
      LOOKUP.put(language, language.name().toLowerCase());
    }
  }

  public String apiName() {
    return LOOKUP.get(this);
  }
}
