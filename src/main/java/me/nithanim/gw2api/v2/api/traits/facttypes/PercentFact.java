package me.nithanim.gw2api.v2.api.traits.facttypes;

import me.nithanim.gw2api.v2.api.traits.FactBase;
import org.apache.commons.lang.builder.ToStringBuilder;

public class PercentFact extends FactBase {
    private int percent;

    public int getPercent() {
        return percent;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 29 * hash + this.percent;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof PercentFact)) {
            return false;
        } else if (this == obj) {
            return true;
        }
        final PercentFact other = (PercentFact) obj;
        return this.percent == other.percent;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
