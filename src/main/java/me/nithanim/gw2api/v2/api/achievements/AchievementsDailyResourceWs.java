package me.nithanim.gw2api.v2.api.achievements;

import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("achievements/daily")
public interface AchievementsDailyResourceWs {
  @GET
  Map<DailyAchievement.Type, List<DailyAchievement>> get();
}
