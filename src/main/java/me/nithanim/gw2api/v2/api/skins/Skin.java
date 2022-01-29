package me.nithanim.gw2api.v2.api.skins;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Skin {
  private int id = -1;
  private String name;
  private SkinType type;
  private String[] flags;
  private String[] restrictions;
  private String icon;
  private String description;
  private SkinDetails details;
}
