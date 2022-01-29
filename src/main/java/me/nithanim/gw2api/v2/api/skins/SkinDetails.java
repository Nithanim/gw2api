package me.nithanim.gw2api.v2.api.skins;

import me.nithanim.gw2api.v2.common.WeightClass;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class SkinDetails {
  private String type;
  private WeightClass weightClass;
  private String damageType;
}
