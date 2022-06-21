package me.nithanim.gw2api.v2.api.items.details;

import java.util.List;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import me.nithanim.gw2api.v2.api.items.Details;
import me.nithanim.gw2api.v2.common.InfusionType;

@Value
@Builder
@Jacksonized
public class UpgradeComponentDetails implements Details {
  UpgradeComponentType type;
  List<UpgradeableItemTypes> flags;
  List<InfusionType> infusionUpgradeFlags;
  String suffix;
  InfixUpgrade infixUpgrade;
  List<String> bonuses;

  public enum UpgradeComponentType {
    DEFAULT,
    GEM,
    RUNE,
    SIGIL
  }

  public enum UpgradeableItemTypes {
    AXE,
    DAGGER,
    FOCUS,
    GREATSWORD,
    HAMMER,
    HARPOON,
    LONG_BOW,
    MACE,
    PISTOL,
    RIFLE,
    SCEPTER,
    SHIELD,
    SHORT_BOW,
    SPEARGUN,
    STAFF,
    SWORD,
    TORCH,
    TRIDENT,
    WARHORN,
    HEAVY_ARMOR,
    MEDIUM_ARMOR,
    LIGHT_ARMOR,
    TRINKET;
  }
}
