package me.nithanim.gw2api.v2.api.traits.facttypes;

import java.util.Objects;
import me.nithanim.gw2api.v2.api.traits.FactBase;
import org.apache.commons.lang.builder.ToStringBuilder;

public class BuffConversionFact extends FactBase {
    private int percent;
    private String source;
    private String target;

    public int getPercent() {
        return percent;
    }

    public String getSource() {
        return source;
    }

    public String getTarget() {
        return target;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 29 * hash + this.percent;
        hash = 29 * hash + Objects.hashCode(this.source);
        hash = 29 * hash + Objects.hashCode(this.target);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof BuffConversionFact)) {
            return false;
        } else if (this == obj) {
            return true;
        }
        final BuffConversionFact other = (BuffConversionFact) obj;
        return this.percent == other.percent
            && Objects.equals(this.source, other.source)
            && Objects.equals(this.target, other.target);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
