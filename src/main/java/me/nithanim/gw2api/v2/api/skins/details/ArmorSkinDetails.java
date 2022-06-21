package me.nithanim.gw2api.v2.api.skins.details;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import me.nithanim.gw2api.v2.api.skins.SkinDetails;
import me.nithanim.gw2api.v2.common.WeightClass;

@Value
@Builder
@Jacksonized
public class ArmorSkinDetails implements SkinDetails {
  String type;
  WeightClass weightClass;
  DyeSlots dyeSlots;

  @Value
  @Builder
  @Jacksonized
  public static class DyeSlots {
    @JsonProperty("default")
    List<DefaultDyeSlot> defaultDyeSlots;
    // TODO overrides

    @Value
    @Builder
    @Jacksonized
    public static class DefaultDyeSlot {
      @Builder.Default int colorId = -1;
      String material;
    }
  }
}
