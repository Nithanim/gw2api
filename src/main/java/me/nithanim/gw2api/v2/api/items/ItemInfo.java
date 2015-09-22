package me.nithanim.gw2api.v2.api.items;

import java.util.Arrays;
import java.util.Objects;
import me.nithanim.gw2api.v2.common.BasicItem;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ItemInfo extends BasicItem {
    private String name;
    private String icon;
    private String description;
    private ItemType type;
    private ItemRarity rarity;
    private int level;
    private int vendorValue;
    private int defaultSkin = -1;
    private String[] flags;
    private String[] restrictions;
    private Details details;

    public String getName() {
        return name;
    }

    public String getIcon() {
        return icon;
    }

    public String getDescription() {
        return description;
    }

    public ItemType getType() {
        return type;
    }

    public ItemRarity getRarity() {
        return rarity;
    }

    public int getLevel() {
        return level;
    }

    public int getVendorValue() {
        return vendorValue;
    }

    public int getDefaultSkin() {
        return defaultSkin;
    }

    public String[] getFlags() {
        return flags;
    }

    public String[] getRestrictions() {
        return restrictions;
    }

    public Details getDetails() {
        return details;
    }

    void setDetails(Details details) {
        this.details = details;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.icon);
        hash = 67 * hash + Objects.hashCode(this.description);
        hash = 67 * hash + Objects.hashCode(this.type);
        hash = 67 * hash + Objects.hashCode(this.rarity);
        hash = 67 * hash + this.level;
        hash = 67 * hash + this.vendorValue;
        hash = 67 * hash + this.defaultSkin;
        hash = 67 * hash + Arrays.deepHashCode(this.flags);
        hash = 67 * hash + Arrays.deepHashCode(this.restrictions);
        hash = 67 * hash + Objects.hashCode(this.details);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ItemInfo)) {
            return false;
        } else if (this == obj) {
            return true;
        }
        final ItemInfo other = (ItemInfo) obj;
        return Objects.equals(this.name, other.name)
            && Objects.equals(this.icon, other.icon)
            && Objects.equals(this.description, other.description)
            && this.type == other.type
            && this.rarity == other.rarity
            && this.level == other.level
            && this.vendorValue == other.vendorValue
            && this.defaultSkin == other.defaultSkin
            && Arrays.deepEquals(this.flags, other.flags)
            && Arrays.deepEquals(this.restrictions, other.restrictions)
            && Objects.equals(this.details, other.details);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
