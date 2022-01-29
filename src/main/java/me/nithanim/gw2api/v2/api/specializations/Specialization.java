package me.nithanim.gw2api.v2.api.specializations;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Specialization {
  private int id = -1;
  private String name;
  private String profession;
  private boolean elite;
  private String icon;
  private int[] minorTraits;
  private int[] majorTraits;
  private String background;
}
