package me.nithanim.gw2api.v2.util.jackson;

public interface SubtypeEnum<SUB_TYPE> {
  String name();

  Class<? extends SUB_TYPE> getEnumClass();
}
