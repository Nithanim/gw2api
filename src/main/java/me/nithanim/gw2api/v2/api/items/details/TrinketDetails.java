package me.nithanim.gw2api.v2.api.items.details;

import java.util.List;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import me.nithanim.gw2api.v2.api.items.Details;

@Value
@Builder
@Jacksonized
public class TrinketDetails implements Details {
  TrinketType type;
  List<InfusionSlot> infusionSlots;
  InfixUpgrade infixUpgrade;
  @Builder.Default int suffixItemId = -1;
  String secondarySuffixItemId;

  public enum TrinketType {
    ACCESSORY,
    AMULET,
    RING;
  }
}
