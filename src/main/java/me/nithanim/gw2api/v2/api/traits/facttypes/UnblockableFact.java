package me.nithanim.gw2api.v2.api.traits.facttypes;

import me.nithanim.gw2api.v2.api.traits.FactBase;

@lombok.NoArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString
public class UnblockableFact extends FactBase {
  private boolean unblockable;
}
