package me.nithanim.gw2api.v2.api.items.details;

import java.util.Objects;
import me.nithanim.gw2api.v2.api.items.Details;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ConsumeableDetails implements Details {
    private ConsumeableType type;
    private String description;
    private int durationMs = -1;
    private String unlockType;
    private int colorId = -1;
    private int recipeId = -1;

    public ConsumeableType getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public int getDurationMs() {
        return durationMs;
    }

    public String getUnlockType() {
        return unlockType;
    }

    public int getColorId() {
        return colorId;
    }

    public int getRecipeId() {
        return recipeId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.type);
        hash = 43 * hash + Objects.hashCode(this.description);
        hash = 43 * hash + this.durationMs;
        hash = 43 * hash + Objects.hashCode(this.unlockType);
        hash = 43 * hash + this.colorId;
        hash = 43 * hash + this.recipeId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ConsumeableDetails other = (ConsumeableDetails) obj;
        return this.type == other.type
            && Objects.equals(this.description, other.description)
            && this.durationMs == other.durationMs
            && Objects.equals(this.unlockType, other.unlockType)
            && this.colorId == other.colorId
            && this.recipeId == other.recipeId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public static enum ConsumeableType {
        APPEARANCE_CHANGE, BOOZE, CONTRACT_NPC, FOOD, GENERIC, HALLOWEEN,
        IMMEDIATE, TRANSMUTATION, UNLOCK, UPGRADE_REMOVAL, UTILITY;
    }
}
