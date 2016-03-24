package me.nithanim.gw2api.v2.api.guild.upgrades;

import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.lang.builder.ToStringBuilder;

public class GuildUpgrade {
    private int id = -1;
    private String name;
    private Type type;
    private String icon;
    private int buildTime = -1;
    private int requiredLevel = - -1;
    private int experience = -1;
    private int[] prerequisites;
    private UpgradeCost[] costs;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public String getIcon() {
        return icon;
    }

    public int getBuildTime() {
        return buildTime;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }

    public int getExperience() {
        return experience;
    }

    public int[] getPrerequisites() {
        return prerequisites;
    }

    public UpgradeCost[] getCosts() {
        return costs;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.type);
        hash = 29 * hash + Objects.hashCode(this.icon);
        hash = 29 * hash + this.buildTime;
        hash = 29 * hash + this.requiredLevel;
        hash = 29 * hash + this.experience;
        hash = 29 * hash + Arrays.hashCode(this.prerequisites);
        hash = 29 * hash + Arrays.deepHashCode(this.costs);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final GuildUpgrade other = (GuildUpgrade) obj;
        return this.id == other.id
            && Objects.equals(this.name, other.name)
            && this.type == other.type
            && Objects.equals(this.icon, other.icon)
            && this.buildTime == other.buildTime
            && this.requiredLevel == other.requiredLevel
            && this.experience == other.experience
            && Arrays.equals(this.prerequisites, other.prerequisites)
            && Arrays.deepEquals(this.costs, other.costs);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public static enum Type {
        ACCUMULATING_CURRENCY, BANK_BAG, BOOST, CLAIMABLE, CONSUMABLE, DECORATION, HUB, UNLOCK;
    }
}
