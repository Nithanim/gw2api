package me.nithanim.gw2api.v2.common;

@lombok.NoArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString
public class Item extends BasicItem {
    private int skin = -1;
    private int[] upgrades;
    private int[] infusions;
}
