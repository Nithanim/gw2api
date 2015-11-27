package me.nithanim.gw2api.v2.api.pvp.stats;

import java.util.Map;
import java.util.Objects;
import org.apache.commons.lang.builder.ToStringBuilder;

/*
 * A players collective stats
 */
public class Stat {
    private int pvpRank;
    private WinLoss aggregate;
    private Map<String, WinLoss> professions;
    private Map<String, WinLoss> ladders;

    /**
     * Returns the player's PvP rank.
     *
     * @return an int representing the the player's PvP rank.
     */
    public int getPvpRank() {
        return pvpRank;
    }

    /**
     * Returns statistics from all matches ever played over all professions. You
     * can use {@link #getProfessions()} to get statistics grouped by
     * profession.
     *
     * @return statictics over all matches for all professions
     * @see #getProfessions()
     */
    public WinLoss getAggregate() {
        return aggregate;
    }

    /**
     * Returns statistics of all matches per profession. To get a summary of all
     * professions combined use {@link #getAggregate()}.
     *
     * @return statistics grouped by professions
     * @see #getAggregate()
     */
    public Map<String, WinLoss> getProfessions() {
        return professions;
    }

    /**
     * Returns information about each type of ladder (ranked/unranked)
     *
     * @return information about each type of ladder
     */
    public Map<String, WinLoss> getLadders() {
        return ladders;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.pvpRank;
        hash = 23 * hash + Objects.hashCode(this.aggregate);
        hash = 23 * hash + Objects.hashCode(this.professions);
        hash = 23 * hash + Objects.hashCode(this.ladders);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Stat other = (Stat) obj;
        return Objects.equals(this.pvpRank, other.pvpRank)
            && Objects.equals(this.aggregate, other.aggregate)
            && Objects.equals(this.professions, other.professions)
            && Objects.equals(this.ladders, other.ladders);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
