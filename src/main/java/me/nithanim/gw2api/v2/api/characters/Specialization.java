package me.nithanim.gw2api.v2.api.characters;

import java.util.Arrays;
import me.nithanim.gw2api.v2.util.gson.characters.TraitDeserializer;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Specialization {
    private int id;
    @com.google.gson.annotations.JsonAdapter(TraitDeserializer.class)
    private int[] traits;

    public int getId() {
        return id;
    }

    public int[] getTraits() {
        return traits;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.id;
        hash = 47 * hash + Arrays.hashCode(this.traits);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Specialization other = (Specialization) obj;
        return this.id == other.id
            && Arrays.equals(this.traits, other.traits);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
