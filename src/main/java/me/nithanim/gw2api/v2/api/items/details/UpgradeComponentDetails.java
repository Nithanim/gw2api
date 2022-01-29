package me.nithanim.gw2api.v2.api.items.details;

import me.nithanim.gw2api.v2.api.items.Details;
import me.nithanim.gw2api.v2.common.InfusionType;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class UpgradeComponentDetails implements Details {
  private UpgradeComponentType type;
  private UpgradeableItemTypes[] flags;
  private InfusionType[] infusionUpgradeFlags;
  private String suffix;
  private InfixUpgrade infixUpgrade;
  private String[] bonuses;

  public static enum UpgradeComponentType {
    DEFAULT,
    GEM,
    RUNE,
    SIGIL;
  }

  public static enum UpgradeableItemTypes {
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
