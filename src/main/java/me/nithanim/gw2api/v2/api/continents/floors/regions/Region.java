package me.nithanim.gw2api.v2.api.continents.floors.regions;

import me.nithanim.gw2api.v2.api.continents.floors.regions.maps.Map;
import me.nithanim.gw2api.v2.util.collections.IntObjMap;
import me.nithanim.gw2api.v2.util.mappings.IntMappable;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Region implements IntMappable {
    private int id = -1;
    private String name;
    private int[] labelCoord;
    private IntObjMap<Map> maps;

    @Override
    public int getMappableId() {
        return getId();
    }
}
