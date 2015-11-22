package me.nithanim.gw2api.v2.api.achievements;

import java.util.Map;
import me.nithanim.gw2api.v2.ApiEndpoint;
import me.nithanim.gw2api.v2.common.Language;

public interface AchievementResource extends ApiEndpoint {
    int[] getOverview();

    Achievement get(int id);

    Achievement get(int id, Language lang);

    Achievement[] get(int[] ids);

    Achievement[] get(int id[], Language lang);

    Map<DailyAchievement.Type, DailyAchievement[]> getDailyAchievements();
}
