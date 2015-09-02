package me.nithanim.gw2api.v2.api.commerce.prices;

import java.util.Objects;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ItemPrice {
    private int id;
    private Price buys;
    private Price sells;

    public int getId() {
        return id;
    }

    public Price getBuys() {
        return buys;
    }

    public Price getSells() {
        return sells;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.id;
        hash = 23 * hash + Objects.hashCode(this.buys);
        hash = 23 * hash + Objects.hashCode(this.sells);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ItemPrice other = (ItemPrice) obj;
        return this.id == other.id
            && Objects.equals(this.buys, other.buys)
            && Objects.equals(this.sells, other.sells);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
