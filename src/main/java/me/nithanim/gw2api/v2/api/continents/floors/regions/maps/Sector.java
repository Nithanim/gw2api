package me.nithanim.gw2api.v2.api.continents.floors.regions.maps;

import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Sector {
    private int id;
    private String name;
    private int level;
    private float[] coord;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public float[] getCoord() {
        return coord;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + this.level;
        hash = 67 * hash + Arrays.hashCode(this.coord);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Sector other = (Sector) obj;
        return this.id == other.id
            && Objects.equals(this.name, other.name)
            && this.level == other.level
            && Arrays.equals(this.coord, other.coord);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
