package me.nithanim.gw2api.v2.api.items.details;

import java.util.Arrays;
import java.util.Objects;
import me.nithanim.gw2api.v2.api.items.Details;
import org.apache.commons.lang.builder.ToStringBuilder;

public class WeaponDetails implements Details {
    private WeaponType type;
    private DamageType damageType;
    private int minPower;
    private int maxPower;
    private int defense;
    private InfusionSlot[] infusionSlots;
    private InfixUpgrade infixUpgrade;
    private int suffixItemId = -1;
    private String secondarySuffixItemId;

    public WeaponType getType() {
        return type;
    }

    public DamageType getDamageType() {
        return damageType;
    }

    public int getMinPower() {
        return minPower;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public int getDefense() {
        return defense;
    }

    public InfusionSlot[] getInfusionSlots() {
        return infusionSlots;
    }

    public InfixUpgrade getInfixUpgrade() {
        return infixUpgrade;
    }

    public int getSuffixItemId() {
        return suffixItemId;
    }

    public String getSecondarySuffixItemId() {
        return secondarySuffixItemId;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.type);
        hash = 29 * hash + Objects.hashCode(this.damageType);
        hash = 29 * hash + this.minPower;
        hash = 29 * hash + this.maxPower;
        hash = 29 * hash + this.defense;
        hash = 29 * hash + Arrays.deepHashCode(this.infusionSlots);
        hash = 29 * hash + Objects.hashCode(this.infixUpgrade);
        hash = 29 * hash + this.suffixItemId;
        hash = 29 * hash + Objects.hashCode(this.secondarySuffixItemId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final WeaponDetails other = (WeaponDetails) obj;
        return this.type == other.type
            && this.damageType == other.damageType
            && this.minPower == other.minPower
            && this.maxPower == other.maxPower
            && this.defense == other.defense
            && Arrays.deepEquals(this.infusionSlots, other.infusionSlots)
            && Objects.equals(this.infixUpgrade, other.infixUpgrade)
            && this.suffixItemId != other.suffixItemId
            && Objects.equals(this.secondarySuffixItemId, other.secondarySuffixItemId);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public static enum WeaponType {
        AXE, DAGGER, MACE, PISTOL, SCEPTER, SWORD, FOCUS, SHIELD, TORCH,
        WARHORN, GREATSWORD, HAMMER, LONG_BOW, RIFLE, SHORT_BOW, STAFF, HARPOON,
        SPEARGUN, TRIDENT, LARGE_BUNDLE, SMALL_BUNDLE, TOY, TWO_HANDED_TOY;
    }

    public static enum DamageType {
        FIRE, ICE, LIGHTNING, PHYSICAL, CHOKING;
    }
}
