package me.nithanim.gw2api.v2.api.traits.facttypes;

import java.util.Objects;
import me.nithanim.gw2api.v2.api.traits.FactBase;
import org.apache.commons.lang.builder.ToStringBuilder;

public class BuffFact extends FactBase {
    private int duration;
    private String status;
    private String description;
    private int applyCount;

    public int getDuration() {
        return duration;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public int getApplyCount() {
        return applyCount;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 79 * hash + this.duration;
        hash = 79 * hash + Objects.hashCode(this.status);
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + this.applyCount;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof BuffFact)) {
            return false;
        } else if (this == obj) {
            return true;
        }
        final BuffFact other = (BuffFact) obj;
        return this.duration == other.duration
            && Objects.equals(this.status, other.status)
            && Objects.equals(this.description, other.description)
            && this.applyCount == other.applyCount;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
