package me.nithanim.gw2api.v2.api.items.details;

import java.util.Objects;
import me.nithanim.gw2api.v2.api.items.Details;
import org.apache.commons.lang.builder.ToStringBuilder;

public class GizmoDetails implements Details {
    private GizmoType type;

    public GizmoType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.type);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final GizmoDetails other = (GizmoDetails) obj;
        return this.type == other.type;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public static enum GizmoType {
        DEFAULT, CONTAINER_KEY, RENTABLE_CONTRACT_NPC, UNLIMITED_CONSUMEABLE;
    }
}
