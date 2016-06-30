package me.nithanim.gw2api.v2.api.continents.floors.regions.maps;

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
    private int[][] mapRect;
    private int[][] continentRect;
    private java.util.Map<Integer, PointOfInterest> pointsOfInterest;
    private java.util.Map<Integer, Task> tasks;
    private SkillChallenge[] skillChallenges;
    private java.util.Map<Integer, Sector> sectors;
}
