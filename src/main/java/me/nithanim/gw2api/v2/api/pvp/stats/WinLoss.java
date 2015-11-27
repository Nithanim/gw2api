package me.nithanim.gw2api.v2.api.pvp.stats;

import org.apache.commons.lang.builder.ToStringBuilder;

/*
 * A class representing players collective stats.
 */
public class WinLoss {
    private int wins;
    private int losses;
    private int desertions;
    private int byes;
    private int forfeits;

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getDesertions() {
        return desertions;
    }

    public int getByes() {
        return byes;
    }

    public int getForfeits() {
        return forfeits;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + wins;
        hash = 97 * hash + losses;
        hash = 97 * hash + desertions;
        hash = 97 * hash + byes;
        hash = 97 * hash + forfeits;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final WinLoss other = (WinLoss) obj;
        return this.wins == other.wins
            && this.losses == other.losses
            && this.desertions == other.desertions
            && this.byes == other.byes
            && this.forfeits == other.forfeits;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
