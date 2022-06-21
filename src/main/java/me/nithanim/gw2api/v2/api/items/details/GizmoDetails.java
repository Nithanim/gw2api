package me.nithanim.gw2api.v2.api.items.details;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import me.nithanim.gw2api.v2.api.items.Details;

@Value
@Builder
@Jacksonized
public class GizmoDetails implements Details {
  GizmoType type;

  public enum GizmoType {
    DEFAULT,
    CONTAINER_KEY,
    RENTABLE_CONTRACT_NPC,
    UNLIMITED_CONSUMABLE;
  }
}
