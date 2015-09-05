package me.nithanim.gw2api.v2.api.traits.facttypes;

import me.nithanim.gw2api.v2.api.traits.Fact;
import me.nithanim.gw2api.v2.api.traits.FactBase;
import org.apache.commons.lang.builder.ToStringBuilder;

public class RadiusFact extends FactBase {
    private int radius;

    public int getRadius() {
        return radius;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 97 * hash + this.radius;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof RadiusFact)) {
            return false;
        } else if (this == obj) {
            return true;
        }
        final RadiusFact other = (RadiusFact) obj;
        return this.radius == other.radius;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
