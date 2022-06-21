package me.nithanim.gw2api.v2.api.traits.facttypes;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Value
@SuperBuilder
@Jacksonized
@EqualsAndHashCode(callSuper = true)
public class PrefixedBuffFact extends BuffFact {
  Prefix prefix;

  @Value
  @Builder
  @Jacksonized
  public static class Prefix {
    String text;
    String icon;
    String status;
    String description;
  }
}
