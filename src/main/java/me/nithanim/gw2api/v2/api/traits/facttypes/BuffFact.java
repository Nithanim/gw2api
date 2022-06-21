package me.nithanim.gw2api.v2.api.traits.facttypes;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;
import me.nithanim.gw2api.v2.api.traits.FactBase;

@SuperBuilder
@Jacksonized
@EqualsAndHashCode(callSuper = true)
@Getter
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@ToString
public class BuffFact extends FactBase {
  int duration;
  String status;
  String description;
  int applyCount;
}
