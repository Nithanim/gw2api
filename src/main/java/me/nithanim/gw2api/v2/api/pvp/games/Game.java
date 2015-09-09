package me.nithanim.gw2api.v2.api.pvp.games;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import me.nithanim.gw2api.v2.api.characters.Character.Profession;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.joda.time.DateTime;

public class Game {
    private String id;
    private int mapId;
    private DateTime started;
    private DateTime ended;
    private String result;
    private Profession profession;
    @SerializedName("score")
    private Score score;

    public String getId() {
        return id;
    }

    public int getMapId() {
        return mapId;
    }

    public DateTime getStarted() {
        return started;
    }

    public DateTime getEnded() {
        return ended;
    }

    public String getResult() {
        return result;
    }

    public Profession getProfession() {
        return profession;
    }

    public Score getScore() {
        return score;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + this.mapId;
        hash = 97 * hash + Objects.hashCode(this.started);
        hash = 97 * hash + Objects.hashCode(this.ended);
        hash = 97 * hash + Objects.hashCode(this.result);
        hash = 97 * hash + Objects.hashCode(this.profession);
        hash = 97 * hash + Objects.hashCode(this.score);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        return Objects.equals(this.id, other.id)
            && this.mapId == other.mapId
            && Objects.equals(this.started, other.started)
            && Objects.equals(this.ended, other.ended)
            && Objects.equals(this.result, other.result)
            && this.profession == other.profession
            && Objects.equals(this.score, other.score);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
