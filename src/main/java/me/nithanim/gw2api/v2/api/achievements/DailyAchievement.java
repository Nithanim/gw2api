package me.nithanim.gw2api.v2.api.achievements;

import java.util.List;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class DailyAchievement {
  @Builder.Default int id = -1;
  Level level;
  List<String> requiredAccess;

  @Value
  @Builder
  @Jacksonized
  public static class Level {
    @Builder.Default int min = -1;
    @Builder.Default int max = -1;
  }

  public enum Type {
    PVE,
    PVP,
    WVW,
    FRACTALS,
    SPECIAL
  }
}
