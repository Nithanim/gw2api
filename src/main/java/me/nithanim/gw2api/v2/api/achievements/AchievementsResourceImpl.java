package me.nithanim.gw2api.v2.api.achievements;

import java.util.List;
import java.util.Map;

import me.nithanim.gw2api.v2.util.rest.IdsResourceBaseInt;

public class AchievementsResourceImpl extends IdsResourceBaseInt<Achievement>
    implements AchievementsResource {
  private final AchievementsDailyResourceWs daily;

  public AchievementsResourceImpl(AchievementsResourceWs ws, AchievementsDailyResourceWs daily) {
    super(ws);
    this.daily = daily;
  }

  @Override
  public Map<DailyAchievement.Type, List<DailyAchievement>> getDailyAchievements() {
    return daily.get();
  }
}
