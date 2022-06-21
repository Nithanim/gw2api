package me.nithanim.gw2api.v2.api.achievements;

import java.util.List;
import java.util.Map;

import me.nithanim.gw2api.v2.ApiEndpoint;

public interface AchievementsResource extends ApiEndpoint {
  int[] getOverview();

  Achievement get(int id);

  Achievement get(int id, String lang);

  List<Achievement> get(int[] ids);

  List<Achievement> get(int[] id, String lang);

  Map<DailyAchievement.Type, List<DailyAchievement>> getDailyAchievements();
}
