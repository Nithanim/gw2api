package me.nithanim.gw2api.v2.api.items.details;

import java.util.Arrays;
import java.util.Objects;
import me.nithanim.gw2api.v2.api.items.Details;
import org.apache.commons.lang.builder.ToStringBuilder;

public class BackDetails implements Details {
    private InfusionSlot[] infusionSlots;
    private InfixUpgrade infixUpgrade;
    private int suffixItemId = -1;
    private String secondarySuffixItemId;

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
        int hash = 3;
        hash = 17 * hash + Arrays.deepHashCode(this.infusionSlots);
        hash = 17 * hash + Objects.hashCode(this.infixUpgrade);
        hash = 17 * hash + this.suffixItemId;
        hash = 17 * hash + Objects.hashCode(this.secondarySuffixItemId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final BackDetails other = (BackDetails) obj;
        return Arrays.deepEquals(this.infusionSlots, other.infusionSlots)
            && Objects.equals(this.infixUpgrade, other.infixUpgrade)
            && this.suffixItemId == other.suffixItemId
            && Objects.equals(this.secondarySuffixItemId, other.secondarySuffixItemId);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
