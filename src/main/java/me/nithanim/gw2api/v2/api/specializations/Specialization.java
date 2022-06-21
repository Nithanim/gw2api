package me.nithanim.gw2api.v2.api.specializations;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import me.nithanim.gw2api.v2.api.characters.Character;

@Value
@Builder
@Jacksonized
public class Specialization {
  @Builder.Default int id = -1;
  String name;
  Character.Profession profession;
  boolean elite;
  String icon;
  int[] minorTraits;
  int[] majorTraits;
  String background;
}
