package me.nithanim.gw2api.v2.api.guild.upgrades;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class UpgradeCost {
    private Type type;
    private String name;
    private int count = -1;
    private int itemId = -1;

    public static enum Type {
        ITEM, COLLECTIBLE, CURRENCY;
    }
}
