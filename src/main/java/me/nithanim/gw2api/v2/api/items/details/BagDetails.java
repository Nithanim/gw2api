package me.nithanim.gw2api.v2.api.items.details;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import me.nithanim.gw2api.v2.api.items.Details;

@Value
@Builder
@Jacksonized
public class BagDetails implements Details {
  @Builder.Default int size = -1;
  boolean noSellOrSort;
}
