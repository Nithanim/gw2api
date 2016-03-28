package me.nithanim.gw2api.v2.api.items.details;

import me.nithanim.gw2api.v2.api.items.Details;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class GizmoDetails implements Details {
    private GizmoType type;

    public static enum GizmoType {
        DEFAULT, CONTAINER_KEY, RENTABLE_CONTRACT_NPC, UNLIMITED_CONSUMEABLE;
    }
}
