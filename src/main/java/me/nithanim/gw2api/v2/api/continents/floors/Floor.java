package me.nithanim.gw2api.v2.api.continents.floors;

import java.util.Map;
import me.nithanim.gw2api.v2.api.continents.floors.regions.Region;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Floor {
    private int id = -1;
    private int[] textureDims;
    private Map<Integer, Region> regions;
}
