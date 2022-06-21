package me.nithanim.gw2api.v2.api.items.details;

import java.util.List;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import me.nithanim.gw2api.v2.api.items.Details;

@Value
@Builder
@Jacksonized
public class WeaponDetails implements Details {
  WeaponType type;
  DamageType damageType;
  @Builder.Default int minPower = -1;
  @Builder.Default int maxPower = -1;
  @Builder.Default int defense = -1;
  List<InfusionSlot> infusionSlots;
  InfixUpgrade infixUpgrade;
  @Builder.Default int suffixItemId = -1;
  String secondarySuffixItemId;

  public enum WeaponType {
    AXE,
    DAGGER,
    MACE,
    PISTOL,
    SCEPTER,
    SWORD,
    FOCUS,
    SHIELD,
    TORCH,
    WARHORN,
    GREATSWORD,
    HAMMER,
    LONG_BOW,
    RIFLE,
    SHORT_BOW,
    STAFF,
    HARPOON,
    SPEARGUN,
    TRIDENT,
    LARGE_BUNDLE,
    SMALL_BUNDLE,
    TOY,
    TWO_HANDED_TOY;
  }

  public enum DamageType {
    FIRE,
    ICE,
    LIGHTNING,
    PHYSICAL,
    CHOKING;
  }
}
