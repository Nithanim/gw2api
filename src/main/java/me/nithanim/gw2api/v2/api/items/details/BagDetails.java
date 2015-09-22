package me.nithanim.gw2api.v2.api.items.details;

import me.nithanim.gw2api.v2.api.items.Details;
import org.apache.commons.lang.builder.ToStringBuilder;

public class BagDetails implements Details {
    private int size;
    private boolean noSellOrSort;

    public int getSize() {
        return size;
    }

    public boolean isNoSellOrSort() {
        return noSellOrSort;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.size;
        hash = 53 * hash + (this.noSellOrSort ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final BagDetails other = (BagDetails) obj;
        return this.size == other.size
            && this.noSellOrSort == other.noSellOrSort;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
