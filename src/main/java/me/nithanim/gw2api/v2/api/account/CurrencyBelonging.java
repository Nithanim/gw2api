package me.nithanim.gw2api.v2.api.account;

import org.apache.commons.lang.builder.ToStringBuilder;

public class CurrencyBelonging {
    private int id;
    private int value;

    public int getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + this.id;
        hash = 13 * hash + this.value;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final CurrencyBelonging other = (CurrencyBelonging) obj;
        return this.id == other.id && this.value == other.value;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
