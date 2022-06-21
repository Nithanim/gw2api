package me.nithanim.gw2api.v2.api.traits;

import me.nithanim.gw2api.v2.util.jackson.SubtypeTypeResolver;

public class FactTypeResolver extends SubtypeTypeResolver<Fact> {
  public FactTypeResolver() {
    super(FactType.class);
  }
}
