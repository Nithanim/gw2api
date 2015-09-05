package me.nithanim.gw2api.v2.api.traits.facttypes;

import java.util.Objects;
import me.nithanim.gw2api.v2.api.traits.FactBase;
import org.apache.commons.lang.builder.ToStringBuilder;

public class AttributeAdjustFact extends FactBase {
    private int value;
    private String target;

    public int getValue() {
        return value;
    }

    public String getTarget() {
        return target;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 37 * hash + this.value;
        hash = 37 * hash + Objects.hashCode(this.target);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof AttributeAdjustFact)) {
            return false;
        } else if (this == obj) {
            return true;
        }
        final AttributeAdjustFact other = (AttributeAdjustFact) obj;
        return this.value == other.value
            && Objects.equals(this.target, other.target);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
