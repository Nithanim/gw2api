package me.nithanim.gw2api.v2.api.items.details;

import me.nithanim.gw2api.v2.common.InfusionType;
import java.util.Arrays;
import org.apache.commons.lang.builder.ToStringBuilder;

public class InfusionSlot {
    private InfusionType[] flags;
    private int itemId;

    public InfusionType[] getFlags() {
        return flags;
    }

    public int getItemId() {
        return itemId;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Arrays.deepHashCode(this.flags);
        hash = 47 * hash + this.itemId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final InfusionSlot other = (InfusionSlot) obj;
        return Arrays.deepEquals(this.flags, other.flags)
            && this.itemId == other.itemId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
