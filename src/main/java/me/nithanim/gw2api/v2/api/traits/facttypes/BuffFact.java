package me.nithanim.gw2api.v2.api.traits.facttypes;

import me.nithanim.gw2api.v2.api.traits.FactBase;

@lombok.NoArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString
public class BuffFact extends FactBase {
  private int duration;
  private String status;
  private String description;
  private int applyCount;
}
