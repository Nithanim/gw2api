package me.nithanim.gw2api.v2.api.account;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class AchievementStatus {
    private int id = -1;
    private int current = -1;
    private int max = -1;
    private boolean done = false;
    private int[] bits;
    private int repeated = -1;
}
