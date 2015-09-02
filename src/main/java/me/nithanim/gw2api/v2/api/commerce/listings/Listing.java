package me.nithanim.gw2api.v2.api.commerce.listings;

import java.util.Arrays;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Listing {
    private int id;
    private ListingPart[] buys;
    private ListingPart[] sells;

    public int getId() {
        return id;
    }

    public ListingPart[] getBuys() {
        return buys;
    }

    public ListingPart[] getSells() {
        return sells;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Arrays.deepHashCode(this.buys);
        hash = 97 * hash + Arrays.deepHashCode(this.sells);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Listing other = (Listing) obj;
        return this.id == other.id
            && Arrays.deepEquals(this.buys, other.buys)
            && Arrays.deepEquals(this.sells, other.sells);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
