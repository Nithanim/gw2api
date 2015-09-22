package me.nithanim.gw2api.v2.api.skins;

import java.util.Objects;
import me.nithanim.gw2api.v2.common.WeightClass;
import org.apache.commons.lang.builder.ToStringBuilder;

public class SkinDetails {
    private String type;
    private WeightClass weightClass;
    private String damageType;

    public String getType() {
        return type;
    }

    public WeightClass getWeightClass() {
        return weightClass;
    }

    public String getDamageClass() {
        return damageType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.type);
        hash = 71 * hash + Objects.hashCode(this.weightClass);
        hash = 71 * hash + Objects.hashCode(this.damageType);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final SkinDetails other = (SkinDetails) obj;
        return Objects.equals(this.type, other.type)
            && Objects.equals(this.weightClass, other.weightClass)
            && Objects.equals(this.damageType, other.damageType);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
