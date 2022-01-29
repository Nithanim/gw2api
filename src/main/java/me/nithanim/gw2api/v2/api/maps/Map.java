package me.nithanim.gw2api.v2.api.maps;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Map {
  private int id = -1;
  private String name;
  private int minLevel = -1;
  private int maxLevel = -1;
  private int defaultFloor = -1;
  private int[] floors;
  private int regionId = -1;
  private String regionName;
  private int continentId = -1;
  private String continentName;
  private int[][] mapRect;
  private int[][] continentRect;
}
