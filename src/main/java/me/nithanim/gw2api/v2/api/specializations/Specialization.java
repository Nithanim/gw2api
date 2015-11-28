package me.nithanim.gw2api.v2.api.specializations;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.Arrays;
import java.util.Objects;

public class Specialization {
    private int id;
    private String name;
    private String profession;
    private boolean elite;
    private String icon;
    private int[] minorTraits;
    private int[] majorTraits;
    private String background;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public boolean isElite() {
        return elite;
    }

    public String getIcon() {
        return icon;
    }

    public int[] getMinorTraits() {
        return minorTraits;
    }

    public int[] getMajorTraits() {
        return majorTraits;
    }

    public String getBackground() {
        return background;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.id;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.profession);
        hash = 53 * hash + (this.elite ? 1 : 0);
        hash = 53 * hash + Objects.hashCode(this.icon);
        hash = 53 * hash + Arrays.hashCode(this.minorTraits);
        hash = 53 * hash + Arrays.hashCode(this.majorTraits);
        hash = 53 * hash + Objects.hashCode(this.background);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Specialization other = (Specialization) obj;
        return this.id == other.id
            && Objects.equals(this.name, other.name)
            && Objects.equals(this.profession, other.profession)
            && this.elite == other.elite
            && Objects.equals(this.icon, other.icon)
            && Arrays.equals(this.minorTraits, other.minorTraits)
            && Arrays.equals(this.majorTraits, other.majorTraits)
            && Objects.equals(this.background, other.background);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
