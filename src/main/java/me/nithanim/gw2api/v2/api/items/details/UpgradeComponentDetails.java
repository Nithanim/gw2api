package me.nithanim.gw2api.v2.api.items.details;

import java.util.Arrays;
import java.util.Objects;
import me.nithanim.gw2api.v2.api.items.Details;
import me.nithanim.gw2api.v2.common.InfusionType;
import org.apache.commons.lang.builder.ToStringBuilder;

public class UpgradeComponentDetails implements Details {
    private UpgradeComponentType type;
    private UpgradeableItemTypes[] flags;
    private InfusionType[] infusionUpgradeFlags;
    private String suffix;
    private InfixUpgrade infixUpgrade;
    private String[] bonuses;

    public UpgradeComponentType getType() {
        return type;
    }

    public UpgradeableItemTypes[] getFlags() {
        return flags;
    }

    public InfusionType[] getInfusionUpgradeFlags() {
        return infusionUpgradeFlags;
    }

    public String getSuffix() {
        return suffix;
    }

    public InfixUpgrade getInfixUpgrade() {
        return infixUpgrade;
    }

    public String[] getBonuses() {
        return bonuses;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.type);
        hash = 31 * hash + Arrays.deepHashCode(this.flags);
        hash = 31 * hash + Arrays.deepHashCode(this.infusionUpgradeFlags);
        hash = 31 * hash + Objects.hashCode(this.suffix);
        hash = 31 * hash + Objects.hashCode(this.infixUpgrade);
        hash = 31 * hash + Arrays.deepHashCode(this.bonuses);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final UpgradeComponentDetails other = (UpgradeComponentDetails) obj;
        return this.type == other.type
            && Arrays.deepEquals(this.flags, other.flags)
            && Arrays.deepEquals(this.infusionUpgradeFlags, other.infusionUpgradeFlags)
            && Objects.equals(this.suffix, other.suffix)
            && Objects.equals(this.infixUpgrade, other.infixUpgrade)
            && Arrays.deepEquals(this.bonuses, other.bonuses);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public static enum UpgradeComponentType {
        DEFAULT, GEM, RUNE, SIGIL;
    }

    public static enum UpgradeableItemTypes {
        AXE, DAGGER, FOCUS, GREATSWORD, HAMMER, HARPOON, LONG_BOW, MACE, PISTOL,
        RIFLE, SCEPTER, SHIELD, SHORT_BOW, SPEARGUN, STAFF, SWORD, TORCH,
        TRIDENT, WARHORN, HEAVY_ARMOR, MEDIUM_ARMOR, LIGHT_ARMOR, TRINKET;
    }
}
