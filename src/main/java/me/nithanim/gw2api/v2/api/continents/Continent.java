package me.nithanim.gw2api.v2.api.continents;

import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Continent {
    private int id;
    private String name;
    @SerializedName("continent_dims")
    private int[] dimensions;
    private int minZoom;
    private int maxZoom;
    private int[] floors;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int[] getDimensions() {
        return dimensions;
    }

    public int getMinZoom() {
        return minZoom;
    }

    public int getMaxZoom() {
        return maxZoom;
    }

    public int[] getFloors() {
        return floors;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.id;
        hash = 13 * hash + Objects.hashCode(this.name);
        hash = 13 * hash + Arrays.hashCode(this.dimensions);
        hash = 13 * hash + this.minZoom;
        hash = 13 * hash + this.maxZoom;
        hash = 13 * hash + Arrays.hashCode(this.floors);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Continent other = (Continent) obj;
        return this.id == other.id
            && Objects.equals(this.name, other.name)
            && Arrays.equals(this.dimensions, other.dimensions)
            && this.minZoom == other.minZoom
            && this.maxZoom == other.maxZoom
            && Arrays.equals(this.floors, other.floors);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
