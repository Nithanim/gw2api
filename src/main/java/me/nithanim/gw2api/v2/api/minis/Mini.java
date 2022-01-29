package me.nithanim.gw2api.v2.api.minis;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Mini {
  private int id = -1;
  private String name;
  private String unlock;
  private String icon;
  private int order = -1;
  private int itemId = -1;
}
