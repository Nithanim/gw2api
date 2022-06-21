package me.nithanim.gw2api.v2.api.items.details;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import me.nithanim.gw2api.v2.api.items.Details;

@Value
@Builder
@Jacksonized
public class SalvageKitDetails implements Details {
  SalvageKitType type;
  @Builder.Default int charges = -1;

  public enum SalvageKitType {
    SALVAGE
  }
}
