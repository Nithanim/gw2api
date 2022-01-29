package me.nithanim.gw2api.v2.api.continents.floors.regions.maps;

import me.nithanim.gw2api.v2.util.mappings.IntMappable;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Task implements IntMappable {
  private int id = -1;
  private int level = -1;
  private String objective;
  private float[] coord;

  @Override
  public int getMappableId() {
    return getId();
  }
}
