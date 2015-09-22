package me.nithanim.gw2api.v2.api.items.details;

import java.util.Objects;
import me.nithanim.gw2api.v2.api.items.Details;
import org.apache.commons.lang.builder.ToStringBuilder;

public class SalvageKitDetails implements Details {
    private SalvageKitType type;
    private int charges;

    public SalvageKitType getType() {
        return type;
    }

    public int getCharges() {
        return charges;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.type);
        hash = 17 * hash + this.charges;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final SalvageKitDetails other = (SalvageKitDetails) obj;
        return this.type == other.type
            && this.charges == other.charges;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public static enum SalvageKitType {
        SALVAGE;
    }
}
