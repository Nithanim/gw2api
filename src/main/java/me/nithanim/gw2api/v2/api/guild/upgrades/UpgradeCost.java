package me.nithanim.gw2api.v2.api.guild.upgrades;

import java.util.Objects;
import org.apache.commons.lang.builder.ToStringBuilder;

public class UpgradeCost {
    private Type type;
    private String name;
    private int count = -1;
    private int itemId = -1;

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public int getItemId() {
        return itemId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.type);
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + this.count;
        hash = 41 * hash + this.itemId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final UpgradeCost other = (UpgradeCost) obj;
        return this.type == other.type
            && Objects.equals(this.name, other.name)
            && this.count == other.count
            && this.itemId == other.itemId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public static enum Type {
        ITEM, COLLECTIBLE, CURRENCY;
    }
}
