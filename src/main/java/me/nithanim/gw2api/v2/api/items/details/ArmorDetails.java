package me.nithanim.gw2api.v2.api.items.details;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import me.nithanim.gw2api.v2.api.items.Details;
import me.nithanim.gw2api.v2.common.WeightClass;

@Value
@Builder
@Jacksonized
public class ArmorDetails implements Details {
  ArmorSlotType type;
  WeightClass weightClass;
  int defense;
  InfusionSlot[] infusionSlots;
  InfixUpgrade infixUpgrade;
  int suffixItemId = -1;
  String secondarySuffixItemId;
  int[] statChoices;

  public enum ArmorSlotType {
    BOOTS,
    COAT,
    GLOVES,
    HELM,
    HELM_AQUATIC,
    LEGGINGS,
    SHOULDERS;
  }
}
