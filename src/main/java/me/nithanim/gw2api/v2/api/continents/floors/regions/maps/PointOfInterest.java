package me.nithanim.gw2api.v2.api.continents.floors.regions.maps;

import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.lang.builder.ToStringBuilder;

public class PointOfInterest {
    private int id;
    private String name;
    private String type;
    private float[] coord;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public float[] getCoord() {
        return coord;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.type);
        hash = 97 * hash + Arrays.hashCode(this.coord);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final PointOfInterest other = (PointOfInterest) obj;
        return this.id == other.id
            && Objects.equals(this.name, other.name)
            && Objects.equals(this.type, other.type)
            && Arrays.equals(this.coord, other.coord);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
