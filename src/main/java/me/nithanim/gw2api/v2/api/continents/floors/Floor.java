package me.nithanim.gw2api.v2.api.continents.floors;

import me.nithanim.gw2api.v2.api.continents.floors.regions.Region;
import me.nithanim.gw2api.v2.util.collections.IntObjMap;
import me.nithanim.gw2api.v2.util.mappings.IntMappable;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Floor implements IntMappable {
    private int id = -1;
    private int[] textureDims;
    private IntObjMap<Region> regions;

    @Override
    public int getMappableId() {
        return getId();
    }
}
