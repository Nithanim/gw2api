package me.nithanim.gw2api.v2.api.continents.floors.regions.maps;

import me.nithanim.gw2api.v2.util.collections.IntObjMap;
import me.nithanim.gw2api.v2.util.mappings.IntMappable;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Map implements IntMappable {
  private int id = -1;
  private String name;
  private int minLevel = -1;
  private int maxLevel = -1;
  private int defaultFloor = -1;
  private int[][] mapRect;
  private int[][] continentRect;
  private IntObjMap<PointOfInterest> pointsOfInterest;
  private IntObjMap<Task> tasks;
  private SkillChallenge[] skillChallenges;
  private IntObjMap<Sector> sectors;

  @Override
  public int getMappableId() {
    return getId();
  }
}
