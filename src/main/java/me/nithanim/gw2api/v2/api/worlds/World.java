package me.nithanim.gw2api.v2.api.worlds;

import java.util.Objects;
import org.apache.commons.lang.builder.ToStringBuilder;

public class World {
    private int id;
    private String name;
    private Population population;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Population getPopulation() {
        return population;
    }

    public boolean isNorthAmerica() {
        return getRegionCode() == 1;
    }

    public boolean isEurope() {
        return getRegionCode() == 2;
    }

    public int getRegionCode() {
        return id / 1000;
    }

    public boolean isFrench() {
        return getLanguageCode() == 1;
    }

    public boolean isGerman() {
        return getLanguageCode() == 2;
    }

    public boolean isSpanish() {
        return getLanguageCode() == 3;
    }

    public int getLanguageCode() {
        return (id / 100) % 10;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.population);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final World other = (World) obj;
        return this.id == other.id
            && Objects.equals(this.name, other.name)
            && this.population == other.population;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
