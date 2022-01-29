package me.nithanim.gw2api.v2.api.achievements;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Achievement {
  private int id = -1;
  private String icon;
  private String name;
  private String description;
  private String requirement;
  private Type type;
  private Flag[] flags;

  public static enum Type {
    DEFAULT,
    ITEM_SET;
  }

  public static enum Flag {
    PVP,
    CATEGORY_DISPLAY,
    MOVE_TO_TOP,
    IGNORE_NEARLY_COMPLETE;
  }
}
