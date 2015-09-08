package me.nithanim.gw2api.v2.api.continents.floors.regions.maps;

import java.util.Arrays;
import org.apache.commons.lang.builder.ToStringBuilder;

public class SkillChallenge {
    private float[] coord;

    public float[] getCoord() {
        return coord;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Arrays.hashCode(this.coord);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final SkillChallenge other = (SkillChallenge) obj;
        return Arrays.equals(this.coord, other.coord);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
