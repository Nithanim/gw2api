package me.nithanim.gw2api.v2.api.traits.facttypes;

import me.nithanim.gw2api.v2.api.traits.Fact;
import me.nithanim.gw2api.v2.api.traits.FactBase;
import org.apache.commons.lang.builder.ToStringBuilder;

public class TimeFact extends FactBase {
    private int duration;

    public int getDuration() {
        return duration;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.duration;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof TimeFact)) {
            return false;
        } else if (this == obj) {
            return true;
        }
        final TimeFact other = (TimeFact) obj;
        return this.duration == other.duration;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
