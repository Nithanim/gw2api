package me.nithanim.gw2api.v2.api.skins;

import me.nithanim.gw2api.v2.util.jackson.SubtypeTypeResolver;

public class SkinTypeResolver extends SubtypeTypeResolver<SkinDetails> {
  public SkinTypeResolver() {
    super(SkinType.class);
  }
}
