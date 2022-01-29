package me.nithanim.gw2api.v2.api.items.details;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class InfixUpgrade {
  private int id = -1;
  private Attribute[] attributes;
  private Buff buff;

  @lombok.NoArgsConstructor
  @lombok.AllArgsConstructor
  @lombok.Getter
  @lombok.EqualsAndHashCode
  @lombok.ToString
  public static class Attribute {
    private AttributeType attribute;
    private int modifier = -1;

    public static enum AttributeType {
      BOON_DURATION,
      CONDITION_DAMAGE,
      CONDITION_DURATION,
      CRIT_DAMAGE,
      HEALING,
      POWER,
      PRECISION,
      TOUGHNESS,
      VITALITY;
    }
  }

  @lombok.NoArgsConstructor
  @lombok.AllArgsConstructor
  @lombok.Getter
  @lombok.EqualsAndHashCode
  @lombok.ToString
  public static class Buff {
    private int skillId = -1;
    private String description;
  }
}
