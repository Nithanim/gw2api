package me.nithanim.gw2api.v2.api.commerce.prices;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Price {
    private int quantity;
    private int unitPrice;

    /**
     * The amount of items being sold/bought.
     *
     * @return
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * The highest buy order or lowest sell offer price in coins.
     *
     * @return
     */
    public int getUnitPrice() {
        return unitPrice;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.quantity;
        hash = 71 * hash + this.unitPrice;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Price other = (Price) obj;
        return this.quantity == other.quantity
            && this.unitPrice == other.unitPrice;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
