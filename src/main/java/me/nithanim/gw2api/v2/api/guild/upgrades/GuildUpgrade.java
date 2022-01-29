package me.nithanim.gw2api.v2.api.guild.upgrades;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class GuildUpgrade {
  private int id = -1;
  private String name;
  private Type type;
  private String icon;
  private int buildTime = -1;
  private int requiredLevel = - -1;
  private int experience = -1;
  private int[] prerequisites;
  private UpgradeCost[] costs;

  public static enum Type {
    ACCUMULATING_CURRENCY,
    BANK_BAG,
    BOOST,
    CLAIMABLE,
    CONSUMABLE,
    DECORATION,
    HUB,
    UNLOCK;
  }
}
