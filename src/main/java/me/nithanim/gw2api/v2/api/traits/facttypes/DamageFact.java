package me.nithanim.gw2api.v2.api.traits.facttypes;

import me.nithanim.gw2api.v2.api.traits.FactBase;
import org.apache.commons.lang.builder.ToStringBuilder;

public class DamageFact extends FactBase {
    private int hitCount;

    public int getHitCount() {
        return hitCount;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.hitCount;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof DamageFact)) {
            return false;
        } else if (this == obj) {
            return true;
        }
        final DamageFact other = (DamageFact) obj;
        return this.hitCount == other.hitCount;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
