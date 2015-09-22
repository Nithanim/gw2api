package me.nithanim.gw2api.v2.api.items.details;

import java.util.Arrays;
import java.util.Objects;
import me.nithanim.gw2api.v2.api.items.Details;
import me.nithanim.gw2api.v2.common.WeightClass;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ArmorDetails implements Details {
    private ArmorSlotType type;
    private WeightClass weightClass;
    private int defence;
    private InfusionSlot[] infusionSlots;
    private InfixUpgrade infixUpgrade;
    private int suffixItemId = -1;
    private String secondarySuffixItemId;

    public ArmorSlotType getType() {
        return type;
    }

    public WeightClass getWeightClass() {
        return weightClass;
    }

    public int getDefence() {
        return defence;
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
        hash = 43 * hash + Objects.hashCode(this.type);
        hash = 43 * hash + Objects.hashCode(this.weightClass);
        hash = 43 * hash + this.defence;
        hash = 43 * hash + Arrays.deepHashCode(this.infusionSlots);
        hash = 43 * hash + Objects.hashCode(this.infixUpgrade);
        hash = 43 * hash + this.suffixItemId;
        hash = 43 * hash + Objects.hashCode(this.secondarySuffixItemId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ArmorDetails other = (ArmorDetails) obj;
        return this.type == other.type
            && this.weightClass == other.weightClass
            && this.defence == other.defence
            && Arrays.deepEquals(this.infusionSlots, other.infusionSlots)
            && Objects.equals(this.infixUpgrade, other.infixUpgrade)
            && this.suffixItemId == other.suffixItemId
            && Objects.equals(this.secondarySuffixItemId, other.secondarySuffixItemId);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(type);
    }

    public static enum ArmorSlotType {
        BOOTS, COAT, GLOVES, HELM, HELM_AQUATIC, LEGGINGS, SHOULDERS;
    }
}
