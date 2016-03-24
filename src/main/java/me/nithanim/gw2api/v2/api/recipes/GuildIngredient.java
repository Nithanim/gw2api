package me.nithanim.gw2api.v2.api.recipes;

import org.apache.commons.lang.builder.ToStringBuilder;

public class GuildIngredient {
    private int upgradeId = -1;
    private int count = -1;

    public int getCount() {
        return count;
    }

    public int getUpgradeId() {
        return upgradeId;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.upgradeId;
        hash = 23 * hash + this.count;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final GuildIngredient other = (GuildIngredient) obj;
        return this.upgradeId == other.upgradeId
            && this.count == other.count;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
