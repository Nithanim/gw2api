package me.nithanim.gw2api.v2.api.skins;

import me.nithanim.gw2api.v2.api.skins.details.ArmorSkinDetails;
import me.nithanim.gw2api.v2.util.jackson.SubtypeEnum;

public enum SkinType implements SubtypeEnum<SkinDetails> {
  ARMOR(ArmorSkinDetails.class),
  WEAPON,
  BACK,
  GATHERING;

  private final Class<? extends SkinDetails> subtype;

  SkinType() {
    this(null);
  }

  SkinType(Class<? extends SkinDetails> subtype) {
    this.subtype = subtype;
  }

  @Override
  public Class<? extends SkinDetails> getEnumClass() {
    return subtype;
  }
}
