package me.nithanim.gw2api.v2.api.continents.floors.regions.maps;

import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Task {
    private int id;
    private int level;
    private String objective;
    private float[] coord;

    public int getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

    public String getObjective() {
        return objective;
    }

    public float[] getCoord() {
        return coord;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.id;
        hash = 19 * hash + this.level;
        hash = 19 * hash + Objects.hashCode(this.objective);
        hash = 19 * hash + Arrays.hashCode(this.coord);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Task other = (Task) obj;
        return this.id == other.id
            && this.level == other.level
            && Objects.equals(this.objective, other.objective)
            && Arrays.equals(this.coord, other.coord);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
