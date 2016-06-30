package me.nithanim.gw2api.v2.api.pvp.games;

import com.google.gson.annotations.SerializedName;
import me.nithanim.gw2api.v2.api.characters.Character.Profession;
import org.joda.time.DateTime;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Game {
    private String id;
    private int mapId = -1;
    private DateTime started;
    private DateTime ended;
    private String result;
    private Profession profession;
    @SerializedName("score")
    private Score score;
}
