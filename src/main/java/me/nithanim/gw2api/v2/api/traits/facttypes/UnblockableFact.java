package me.nithanim.gw2api.v2.api.traits.facttypes;

import me.nithanim.gw2api.v2.api.traits.Fact;
import me.nithanim.gw2api.v2.api.traits.FactBase;
import org.apache.commons.lang.builder.ToStringBuilder;

public class UnblockableFact extends FactBase {
    private boolean unblockable;

    public boolean isUnblockable() {
        return unblockable;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (this.unblockable ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof UnblockableFact)) {
            return false;
        } else if (this == obj) {
            return true;
        }
        final UnblockableFact other = (UnblockableFact) obj;
        return this.unblockable == other.unblockable;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
