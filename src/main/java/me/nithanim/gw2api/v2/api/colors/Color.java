package me.nithanim.gw2api.v2.api.colors;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class Color {
  @Builder.Default int id = -1;
  String name;
  byte[] baseRgb;
  Appearence cloth;
  Appearence leather;
  Appearence metal;

  @Value
  @Builder
  @Jacksonized
  public static class Appearence {
    byte brightness;
    double contrast;
    byte hue;
    double saturation;
    double lightness;
    byte[] rgb;
  }
}
