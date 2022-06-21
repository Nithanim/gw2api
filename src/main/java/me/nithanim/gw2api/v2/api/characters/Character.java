package me.nithanim.gw2api.v2.api.characters;

import java.time.OffsetDateTime;
import java.util.EnumMap;
import java.util.List;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class Character {
  String name;
  Race race;
  Gender gender;
  String profession;
  byte level;
  String guild;
  int age;
  OffsetDateTime created;
  int deaths;
  List<CraftingLevel> crafting;
  EnumMap<SpecializationType, List<Specialization>> specializations;
  List<WornItem> equipment;
  List<Bag> bags;

  public enum Race {
    ASURA,
    CHARR,
    HUMAN,
    NORN,
    SYLVARI;
  }

  public enum Gender {
    MALE,
    FEMALE;
  }

  public enum Profession {
    ELEMENTALIST,
    ENGINEER,
    GUARDIAN,
    MESMER,
    NECROMANCER,
    RANGER,
    THIEF,
    WARRIOR,
    REVENANT
  }
}
