package me.nithanim.gw2api.v2.api.skins.details;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import me.nithanim.gw2api.v2.api.skins.SkinDetails;

@Value
@Builder
@Jacksonized
public class WeaponSkinDetails implements SkinDetails {
  String type;
  String damageType;
}
