package me.nithanim.gw2api.v2.api.achievements;

import java.lang.reflect.Type;
import java.util.EnumMap;

import javax.ws.rs.client.WebTarget;

import com.google.gson.reflect.TypeToken;

import me.nithanim.gw2api.v2.util.rest.IdsResourceBase;
import me.nithanim.gw2api.v2.util.rest.RequestHelper;

public class AchievementResourceImpl extends IdsResourceBase<Achievement, int[]>
    implements AchievementResource {
  private final Type dailyType;

  public AchievementResourceImpl(WebTarget webTarget) {
    super(webTarget.path("achievements"), Achievement.class, int[].class);
    dailyType = new TypeToken<EnumMap<DailyAchievement.Type, DailyAchievement[]>>() {}.getType();
  }

  @Override
  public EnumMap<DailyAchievement.Type, DailyAchievement[]> getDailyAchievements() {
    return RequestHelper.INSTANCE.getRequest(webTarget.path("daily"), dailyType);
  }
}
