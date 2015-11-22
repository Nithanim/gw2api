package me.nithanim.gw2api.v2.api.achievements;

import java.util.Map;
import me.nithanim.gw2api.v2.ApiEndpoint;

public interface AchievementResource extends ApiEndpoint {
    int[] getOverview();

    Achievement get(int id);

    Achievement get(int id, String language);

    Achievement[] get(int[] ids);

    Achievement[] get(int id[], String language);

    Map<DailyAchievement.Type, DailyAchievement[]> getDailyAchievements();
}
