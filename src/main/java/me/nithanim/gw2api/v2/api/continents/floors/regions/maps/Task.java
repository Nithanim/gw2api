package me.nithanim.gw2api.v2.api.continents.floors.regions.maps;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Task {
    private int id = -1;
    private int level = -1;
    private String objective;
    private float[] coord;
}
