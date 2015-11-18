package me.nithanim.gw2api.v2.api.minis;

import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Mini {
    private int id;
    private String name;
    private String unlock;
    private String icon;
    private int order;
    private int item_id;

    public int getId() {return id;}
    public String getName() {return name;}
    public String getUnlock() {return unlock;}
    public String getIcon() {return icon;}
    public int getOrder() {return order;}
    public int getItem_id() {return item_id;}

  @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.id;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.unlock);
        hash = 41 * hash + Objects.hashCode(this.icon);
        hash = 41 * hash + this.id;
        hash = 41 * hash + this.item_id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Mini that = (Mini) obj;
        return this.id == that.id
            && Objects.equals(this.name, that.name)
            && Objects.equals(this.unlock, that.unlock)
            && Objects.equals(this.icon, that.icon)
            && this.order == that.order
            && this.item_id == that.item_id;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append(id)
                .append(name)
                .toString();
    }
}
