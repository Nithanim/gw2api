package me.nithanim.gw2api.v2.api.pvp.stats;

import java.util.Map;

/**
 * A players collective stats
 */
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Stat {
    private int pvpRank = -1;
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
}
