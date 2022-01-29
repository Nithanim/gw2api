package me.nithanim.gw2api.v2.api.colors;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Color {
  private int id = -1;
  private String name;
  private byte[] baseRgb;
  private Appearence cloth;
  private Appearence leather;
  private Appearence metal;

  @lombok.NoArgsConstructor
  @lombok.AllArgsConstructor
  @lombok.Getter
  @lombok.EqualsAndHashCode
  @lombok.ToString
  public static class Appearence {
    private byte brightness;
    private double contrast;
    private byte hue;
    private double saturation;
    private double lightness;
    private byte[] rgb;
  }
}
