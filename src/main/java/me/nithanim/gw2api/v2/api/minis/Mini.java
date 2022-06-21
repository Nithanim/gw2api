package me.nithanim.gw2api.v2.api.minis;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class Mini {
  @Builder.Default int id = -1;
  String name;
  String unlock;
  String icon;
  @Builder.Default int order = -1;
  @Builder.Default int itemId = -1;
}
