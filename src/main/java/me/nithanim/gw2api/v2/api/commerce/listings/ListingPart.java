package me.nithanim.gw2api.v2.api.commerce.listings;

import org.apache.commons.lang.builder.ToStringBuilder;

public class ListingPart {
    private int listings;
    private int unitPrice;
    private int quantity;

    public int getListings() {
        return listings;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + this.listings;
        hash = 11 * hash + this.unitPrice;
        hash = 11 * hash + this.quantity;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ListingPart other = (ListingPart) obj;
        return this.listings == other.listings
            && this.unitPrice == other.unitPrice
            && this.quantity == other.quantity;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
