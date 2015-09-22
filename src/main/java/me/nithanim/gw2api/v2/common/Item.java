package me.nithanim.gw2api.v2.common;

import java.util.Arrays;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Item extends BasicItem {
    private int skin;
    private int[] upgrades;
    private int[] infusions;

    public int getSkin() {
        return skin;
    }

    public int[] getUpgrades() {
        return upgrades;
    }

    public int[] getInfusions() {
        return infusions;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Item)) {
            return false;
        } else if (this == obj) {
            return true;
        }

        final Item other = (Item) obj;
        return super.equals(obj)
            && this.skin == other.skin
            && Arrays.equals(this.upgrades, other.upgrades)
            && Arrays.equals(this.infusions, other.infusions);
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 13 * hash + this.skin;
        hash = 13 * hash + Arrays.hashCode(this.upgrades);
        hash = 13 * hash + Arrays.hashCode(this.infusions);
        return hash;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
