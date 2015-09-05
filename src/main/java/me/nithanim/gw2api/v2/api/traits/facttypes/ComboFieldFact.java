package me.nithanim.gw2api.v2.api.traits.facttypes;

import java.util.Objects;
import me.nithanim.gw2api.v2.api.traits.FactBase;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ComboFieldFact extends FactBase {
    private FieldType fieldType;

    public FieldType getFieldType() {
        return fieldType;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 53 * hash + Objects.hashCode(this.fieldType);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ComboFieldFact)) {
            return false;
        } else if (this == obj) {
            return true;
        }
        final ComboFieldFact other = (ComboFieldFact) obj;
        return Objects.equals(this.fieldType, other.fieldType);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public static enum FieldType {
        AIR, DARK, FIRE, ICE, LIGHT, LIGHTNING, POISON, SMOKE, ETHEREAL, WATER;
    }
}
