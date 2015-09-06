package me.nithanim.gw2api.v2.api.maps;

import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Map {
    private int id;
    private String name;
    private int minLevel;
    private int maxLevel;
    private int defaultFloor;
    private int[] floors;
    private int regionId;
    private String regionName;
    private int continentId;
    private String continentName;
    private int[][] mapRect;
    private int[][] continentRect;

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

    public int[] getFloors() {
        return floors;
    }

    public int getRegionId() {
        return regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public int getContinentId() {
        return continentId;
    }

    public String getContinentName() {
        return continentName;
    }

    public int[][] getMapRect() {
        return mapRect;
    }

    public int[][] getContinentRect() {
        return continentRect;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.id;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + this.minLevel;
        hash = 59 * hash + this.maxLevel;
        hash = 59 * hash + this.defaultFloor;
        hash = 59 * hash + Arrays.hashCode(this.floors);
        hash = 59 * hash + this.regionId;
        hash = 59 * hash + Objects.hashCode(this.regionName);
        hash = 59 * hash + this.continentId;
        hash = 59 * hash + Objects.hashCode(this.continentName);
        hash = 59 * hash + Arrays.deepHashCode(this.mapRect);
        hash = 59 * hash + Arrays.deepHashCode(this.continentRect);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        return this.id != other.id
            && Objects.equals(this.name, other.name)
            && this.minLevel == other.minLevel
            && this.maxLevel == other.maxLevel
            && this.defaultFloor == other.defaultFloor
            && Arrays.equals(this.floors, other.floors)
            && this.regionId == other.regionId
            && Objects.equals(this.regionName, other.regionName)
            && this.continentId == other.continentId
            && Objects.equals(this.continentName, other.continentName)
            && Arrays.deepEquals(this.mapRect, other.mapRect)
            && Arrays.deepEquals(this.continentRect, other.continentRect);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
