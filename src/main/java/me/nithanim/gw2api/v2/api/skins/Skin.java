package me.nithanim.gw2api.v2.api.skins;

import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Skin {
    private int id;
    private String name;
    private SkinType type;
    private String[] flags;
    private String[] restrictions;
    private String icon;
    private String description;
    private SkinDetails details;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public SkinType getType() {
        return type;
    }

    public String[] getFlags() {
        return flags;
    }

    public String[] getRestrictions() {
        return restrictions;
    }

    public String getIcon() {
        return icon;
    }

    public String getDescription() {
        return description;
    }

    public SkinDetails getDetails() {
        return details;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.id;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.type);
        hash = 41 * hash + Arrays.deepHashCode(this.flags);
        hash = 41 * hash + Arrays.deepHashCode(this.restrictions);
        hash = 41 * hash + Objects.hashCode(this.icon);
        hash = 41 * hash + Objects.hashCode(this.description);
        hash = 41 * hash + Objects.hashCode(this.details);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Skin other = (Skin) obj;
        return this.id == other.id
            && Objects.equals(this.name, other.name)
            && this.type == other.type
            && Arrays.deepEquals(this.flags, other.flags)
            && Arrays.deepEquals(this.restrictions, other.restrictions)
            && Objects.equals(this.icon, other.icon)
            && Objects.equals(this.description, other.description)
            && Objects.equals(this.details, other.details);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
