package me.nithanim.gw2api.v2.api.items.details;

import java.util.List;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import me.nithanim.gw2api.v2.common.InfusionType;

@Value
@Builder
@Jacksonized
public class InfusionSlot {
  /** TODO may be broken */
  List<InfusionType> flags;

  @Builder.Default int itemId = -1;
}
