package me.nithanim.gw2api.v2.api.items.details;

import me.nithanim.gw2api.v2.api.items.Details;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class GatheringToolsDetails implements Details {
  private GatheringToolsType type;

  public static enum GatheringToolsType {
    FORAGING,
    LOGGING,
    MINING;
  }
}
