package me.nithanim.gw2api.v2.api.gliders;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class Glider {
  @Builder.Default int id = -1;
  int[] unlockItems;
  String name;
  String description;
  String icon;
  @Builder.Default int order = -1;
  int[] defaultDyes;
}
