package me.nithanim.gw2api.v2.api.continents.floors.regions.maps;

import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Map {
    private int id;
    private String name;
    private int minLevel;
    private int maxLevel;
    private int defaultFloor;
    private int[][] mapRect;
    private int[][] continentRect;
    private java.util.Map<Integer, PointOfInterest> pointsOfInterest;
    private java.util.Map<Integer, Task> tasks;
    private SkillChallenge[] skillChallenges;
    private java.util.Map<Integer, Sector> sectors;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMinLevel() {
        return minLevel;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public int getDefaultFloor() {
        return defaultFloor;
    }

    public int[][] getMapRect() {
        return mapRect;
    }

    public int[][] getContinentRect() {
        return continentRect;
    }

    public java.util.Map<Integer, PointOfInterest> getPointsOfInterest() {
        return pointsOfInterest;
    }

    public java.util.Map<Integer, Task> getTasks() {
        return tasks;
    }

    public SkillChallenge[] getSkillChallenges() {
        return skillChallenges;
    }

    public java.util.Map<Integer, Sector> getSectors() {
        return sectors;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.id;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + this.minLevel;
        hash = 79 * hash + this.maxLevel;
        hash = 79 * hash + this.defaultFloor;
        hash = 79 * hash + Arrays.deepHashCode(this.mapRect);
        hash = 79 * hash + Arrays.deepHashCode(this.continentRect);
        hash = 79 * hash + Objects.hashCode(this.pointsOfInterest);
        hash = 79 * hash + Objects.hashCode(this.tasks);
        hash = 79 * hash + Arrays.deepHashCode(this.skillChallenges);
        hash = 79 * hash + Objects.hashCode(this.sectors);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        return this.id == other.id
            && Objects.equals(this.name, other.name)
            && this.minLevel == other.minLevel
            && this.maxLevel == other.maxLevel
            && this.defaultFloor == other.defaultFloor
            && Arrays.deepEquals(this.mapRect, other.mapRect)
            && Arrays.deepEquals(this.continentRect, other.continentRect)
            && Objects.equals(this.pointsOfInterest, other.pointsOfInterest)
            && Objects.equals(this.tasks, other.tasks)
            && Arrays.deepEquals(this.skillChallenges, other.skillChallenges)
            && Objects.equals(this.sectors, other.sectors);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
