package me.nithanim.gw2api.v2.api.continents.floors.regions;

import java.util.Arrays;
import java.util.Objects;
import me.nithanim.gw2api.v2.api.continents.floors.regions.maps.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Region {
    private String name;
    private int[] labelCoord;
    private java.util.Map<Integer, Map> maps;

    public String getName() {
        return name;
    }

    public int[] getLabelCoord() {
        return labelCoord;
    }

    public java.util.Map<Integer, Map> getMaps() {
        return maps;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Arrays.hashCode(this.labelCoord);
        hash = 67 * hash + Objects.hashCode(this.maps);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Region other = (Region) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Arrays.equals(this.labelCoord, other.labelCoord)) {
            return false;
        }
        if (!Objects.equals(this.maps, other.maps)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
