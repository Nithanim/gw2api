package me.nithanim.gw2api.v2.api.items.details;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import me.nithanim.gw2api.v2.api.items.Details;

@Value
@Builder
@Jacksonized
public class ConsumableDetails implements Details {
  ConsumableType type;
  String description;
  @Builder.Default int durationMs = -1;
  String unlockType;
  @Builder.Default int colorId = -1;
  @Builder.Default int recipeId = -1;

  public enum ConsumableType {
    APPEARANCE_CHANGE,
    BOOZE,
    CONTRACT_NPC,
    FOOD,
    GENERIC,
    HALLOWEEN,
    IMMEDIATE,
    TRANSMUTATION,
    UNLOCK,
    UPGRADE_REMOVAL,
    UTILITY;
  }
}
