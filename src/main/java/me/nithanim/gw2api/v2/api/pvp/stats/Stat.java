package me.nithanim.gw2api.v2.api.pvp.stats;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import java.util.Map;
import me.nithanim.gw2api.v2.api.characters.Character.Profession;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.joda.time.DateTime;

/*
 * A players collective stats
 */
public class Stat {
    private int pvp_rank;
    private WinLoss aggregate; //Aggregate stats over all professions.
    private Map<String, WinLoss> professions; //Profession specific stats.
    private Map<String, WinLoss> ladders; //Ladder specific stats, ie ranked vs unranked.

    public int getPvp_rank() {return pvp_rank;}
    public WinLoss getAggregate() {return aggregate;}
    public Map<String, WinLoss> getProfessions() {return professions;}
    public Map<String, WinLoss> getLadders() {return ladders;}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(pvp_rank);
        hash = 97 * hash + Objects.hashCode(aggregate);
        hash = 97 * hash + Objects.hashCode(professions);
        hash = 97 * hash + Objects.hashCode(ladders);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Stat that = (Stat) obj;
        return Objects.equals(this.pvp_rank, that.pvp_rank)
                && Objects.equals(this.aggregate, that.aggregate)
                && Objects.equals(this.professions, that.professions)
                && Objects.equals(this.ladders, that.ladders);

    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
