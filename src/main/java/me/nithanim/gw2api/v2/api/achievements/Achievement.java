package me.nithanim.gw2api.v2.api.achievements;

import java.util.List;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class Achievement {
  @Builder.Default int id = -1;
  String icon;
  String name;
  String description;
  String requirement;
  Type type;
  List<Flag> flags;

  public enum Type {
    DEFAULT,
    ITEM_SET
  }

  public enum Flag {
    PVP,
    CATEGORY_DISPLAY,
    MOVE_TO_TOP,
    IGNORE_NEARLY_COMPLETE,
    REPEATABLE,
    HIDDEN,
    REQUIRES_UNLOCK,
    REPAIR_ON_LOGIN,
    DAILY,
    WEEKLY,
    MONTHLY,
    PERMANENT,
  }
}
