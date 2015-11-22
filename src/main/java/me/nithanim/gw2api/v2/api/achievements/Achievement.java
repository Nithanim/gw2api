package me.nithanim.gw2api.v2.api.achievements;

import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Achievement {
    private int id = -1;
    private String icon;
    private String name;
    private String description;
    private String requirement;
    private Type type;
    private Flag[] flags;

    public Achievement() {
    }

    public int getId() {
        return id;
    }

    public String getIcon() {
        return icon;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getRequirement() {
        return requirement;
    }

    public Type getType() {
        return type;
    }

    public Flag[] getFlags() {
        return flags;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.icon);
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.description);
        hash = 67 * hash + Objects.hashCode(this.requirement);
        hash = 67 * hash + Objects.hashCode(this.type);
        hash = 67 * hash + Arrays.deepHashCode(this.flags);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Achievement other = (Achievement) obj;
        return this.id == other.id
            && Objects.equals(this.icon, other.icon)
            && Objects.equals(this.name, other.name)
            && Objects.equals(this.description, other.description)
            && Objects.equals(this.requirement, other.requirement)
            && this.type == other.type
            && Arrays.deepEquals(this.flags, other.flags);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public static enum Type {
        DEFAULT, ITEM_SET;
    }

    public static enum Flag {
        PVP, CATEGORY_DISPLAY, MOVE_TO_TOP, IGNORE_NEARLY_COMPLETE;
    }
}
