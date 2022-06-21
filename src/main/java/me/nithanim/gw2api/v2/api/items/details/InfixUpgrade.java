package me.nithanim.gw2api.v2.api.items.details;

import java.util.List;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class InfixUpgrade {
  @Builder.Default int id = -1;
  List<Attribute> attributes;
  Buff buff;

  @Value
  @Builder
  @Jacksonized
  public static class Attribute {
    AttributeType attribute;
    @Builder.Default int modifier = -1;

    public enum AttributeType {
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

  @Value
  @Builder
  @Jacksonized
  public static class Buff {
    @Builder.Default int skillId = -1;
    String description;
  }
}
