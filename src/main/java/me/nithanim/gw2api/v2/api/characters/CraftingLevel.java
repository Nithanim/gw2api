package me.nithanim.gw2api.v2.api.characters;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class CraftingLevel {
  CraftingDiscipline discipline;
  int rating;
  boolean active;
}
