package me.nithanim.gw2api.v2.api.continents.floors.regions.maps;

import me.nithanim.gw2api.v2.util.mappings.IntMappable;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Sector implements IntMappable {
  private int id = -1;
  private String name;
  private int level = -1;
  private float[] coord;

  @Override
  public int getMappableId() {
    return getId();
  }
}
