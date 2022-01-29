package me.nithanim.gw2api.v2.api.traits.facttypes;

@lombok.NoArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString
public class PrefixedBuffFact extends BuffFact {
  private Prefix prefix;

  @lombok.NoArgsConstructor
  @lombok.AllArgsConstructor
  @lombok.Getter
  @lombok.EqualsAndHashCode
  @lombok.ToString
  public static class Prefix {
    private String text;
    private String icon;
    private String status;
    private String description;
  }
}
