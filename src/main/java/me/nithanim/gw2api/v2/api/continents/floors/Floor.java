package me.nithanim.gw2api.v2.api.continents.floors;

import java.util.Arrays;
import me.nithanim.gw2api.v2.api.continents.floors.regions.Region;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Floor {
    private int id;
    private int[] textureDims;
    private Map<Integer, Region> regions;

    public int getId() {
        return id;
    }

    public int[] getTextureDims() {
        return textureDims;
    }

    public Map<Integer, Region> getRegions() {
        return regions;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.id;
        hash = 47 * hash + Arrays.hashCode(this.textureDims);
        hash = 47 * hash + Objects.hashCode(this.regions);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Floor other = (Floor) obj;
        return this.id == other.id
            && Arrays.equals(this.textureDims, other.textureDims)
            && Objects.equals(this.regions, other.regions);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
