package me.nithanim.gw2api.v2.api.achievements;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class DailyAchievement {
    private int id = -1;
    private int levelMin = -1;
    private int levelMax = -1;

    public static enum Type {
        PVE, PVP, WVW;
    }
}
