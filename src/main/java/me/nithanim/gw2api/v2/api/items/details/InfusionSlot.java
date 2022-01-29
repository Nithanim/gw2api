package me.nithanim.gw2api.v2.api.items.details;

import me.nithanim.gw2api.v2.common.InfusionType;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class InfusionSlot {
  private InfusionType[] flags;
  private int itemId = -1;
}
