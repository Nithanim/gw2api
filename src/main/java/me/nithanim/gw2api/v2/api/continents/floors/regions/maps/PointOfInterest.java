package me.nithanim.gw2api.v2.api.continents.floors.regions.maps;

import me.nithanim.gw2api.v2.util.mappings.IntMappable;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class PointOfInterest implements IntMappable {
    private int id;
    private String name;
    private String type;
    private float[] coord;

    @Override
    public int getMappableId() {
        return getId();
    }
}
