package me.nithanim.gw2api.v2.api.pvp.games;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Score {
    private int red;
    private int blue;

    public int getRed() {
        return red;
    }

    public int getBlue() {
        return blue;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + this.red;
        hash = 11 * hash + this.blue;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Score other = (Score) obj;
        return this.red != other.red
            && this.blue != other.blue;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
