package me.nithanim.gw2api.v2.api.traits.facttypes;

import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;
import me.nithanim.gw2api.v2.api.traits.FactBase;

@Value
@SuperBuilder
@Jacksonized
@EqualsAndHashCode(callSuper = true)
public class ComboFieldFact extends FactBase {
  FieldType fieldType;

  public enum FieldType {
    AIR,
    DARK,
    FIRE,
    ICE,
    LIGHT,
    LIGHTNING,
    POISON,
    SMOKE,
    ETHEREAL,
    WATER,
  }
}
