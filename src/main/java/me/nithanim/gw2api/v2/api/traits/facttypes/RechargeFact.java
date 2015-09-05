package me.nithanim.gw2api.v2.api.traits.facttypes;

import me.nithanim.gw2api.v2.api.traits.Fact;
import me.nithanim.gw2api.v2.api.traits.FactBase;
import org.apache.commons.lang.builder.ToStringBuilder;

public class RechargeFact extends FactBase {
    private int value;

    public int getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.value;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof RechargeFact)) {
            return false;
        } else if (this == obj) {
            return true;
        }
        final RechargeFact other = (RechargeFact) obj;
        return this.value == other.value;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
