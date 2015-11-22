package me.nithanim.gw2api.v2.api.minis;

import java.util.Objects;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Mini {
    private int id = -1;
    private String name;
    private String unlock;
    private String icon;
    private int order = -1;
    private int itemId = -1;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUnlock() {
        return unlock;
    }

    public String getIcon() {
        return icon;
    }

    public int getOrder() {
        return order;
    }

    public int getItemId() {
        return itemId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.id;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.unlock);
        hash = 41 * hash + Objects.hashCode(this.icon);
        hash = 41 * hash + this.id;
        hash = 41 * hash + this.itemId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Mini other = (Mini) obj;
        return this.id == other.id
            && Objects.equals(this.name, other.name)
            && Objects.equals(this.unlock, other.unlock)
            && Objects.equals(this.icon, other.icon)
            && this.order == other.order
            && this.itemId == other.itemId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
