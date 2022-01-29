package me.nithanim.gw2api.v2.api.continents;

import com.google.gson.annotations.SerializedName;

import me.nithanim.gw2api.v2.util.mappings.IntMappable;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Continent implements IntMappable {
  private int id = -1;
  private String name;

  @SerializedName("continent_dims")
  private int[] dimensions;

  private int minZoom = -1;
  private int maxZoom = -1;
  private int[] floors;

  @Override
  public int getMappableId() {
    return getId();
  }
}
