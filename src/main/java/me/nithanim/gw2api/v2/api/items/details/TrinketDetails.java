package me.nithanim.gw2api.v2.api.items.details;

import java.util.Arrays;
import java.util.Objects;
import me.nithanim.gw2api.v2.api.items.Details;
import org.apache.commons.lang.builder.ToStringBuilder;

public class TrinketDetails implements Details {
    private TrinketType type;
    private InfusionSlot[] infusionSlots;
    private InfixUpgrade infixUpgrade;
    private int suffixItemId = -1;
    private String secondarySuffixItemId;

    public TrinketType getType() {
        return type;
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
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.type);
        hash = 79 * hash + Arrays.deepHashCode(this.infusionSlots);
        hash = 79 * hash + Objects.hashCode(this.infixUpgrade);
        hash = 79 * hash + this.suffixItemId;
        hash = 79 * hash + Objects.hashCode(this.secondarySuffixItemId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final TrinketDetails other = (TrinketDetails) obj;
        return this.type != other.type
            && Arrays.deepEquals(this.infusionSlots, other.infusionSlots)
            && Objects.equals(this.infixUpgrade, other.infixUpgrade)
            && this.suffixItemId == other.suffixItemId
            && Objects.equals(this.secondarySuffixItemId, other.secondarySuffixItemId);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public static enum TrinketType {
        ACCESSORY, AMULET, RING;
    }
}
