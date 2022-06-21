package me.nithanim.gw2api.v2.api.maps;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class WorldMap {
  @Builder.Default int id = -1;
  String name;
  @Builder.Default int minLevel = -1;
  @Builder.Default int maxLevel = -1;
  @Builder.Default int defaultFloor = -1;
  int[] floors;
  @Builder.Default int regionId = -1;
  String regionName;
  @Builder.Default int continentId = -1;
  String continentName;
  int[][] mapRect;
  int[][] continentRect;
}
