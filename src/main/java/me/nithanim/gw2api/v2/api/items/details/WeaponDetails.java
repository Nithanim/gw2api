package me.nithanim.gw2api.v2.api.items.details;

import me.nithanim.gw2api.v2.api.items.Details;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class WeaponDetails implements Details {
    private WeaponType type;
    private DamageType damageType;
    private int minPower = -1;
    private int maxPower = -1;
    private int defense = -1;
    private InfusionSlot[] infusionSlots;
    private InfixUpgrade infixUpgrade;
    private int suffixItemId = -1;
    private String secondarySuffixItemId;

    public static enum WeaponType {
        AXE, DAGGER, MACE, PISTOL, SCEPTER, SWORD, FOCUS, SHIELD, TORCH,
        WARHORN, GREATSWORD, HAMMER, LONG_BOW, RIFLE, SHORT_BOW, STAFF, HARPOON,
        SPEARGUN, TRIDENT, LARGE_BUNDLE, SMALL_BUNDLE, TOY, TWO_HANDED_TOY;
    }

    public static enum DamageType {
        FIRE, ICE, LIGHTNING, PHYSICAL, CHOKING;
    }
}
