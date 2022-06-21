package me.nithanim.gw2api.v2.api.items;

import me.nithanim.gw2api.v2.util.jackson.SubtypeTypeResolver;

public class ItemTypeResolver extends SubtypeTypeResolver<Details> {
  public ItemTypeResolver() {
    super(ItemType.class);
  }
}
