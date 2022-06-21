package me.nithanim.gw2api.v2.api.traits.facttypes;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;
import me.nithanim.gw2api.v2.api.traits.FactBase;

@Value
@SuperBuilder
@Jacksonized
@EqualsAndHashCode(callSuper = true)
public class RadiusFact extends FactBase {
  @Builder.Default int radius = -1;
}
