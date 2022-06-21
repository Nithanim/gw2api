package me.nithanim.gw2api.v2.api.pvp.games;

import java.time.OffsetDateTime;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import me.nithanim.gw2api.v2.api.characters.Character.Profession;

@Value
@Builder
@Jacksonized
public class Game {
  String id;
  @Builder.Default int mapId = -1;
  OffsetDateTime started;
  OffsetDateTime ended;
  String result;
  Profession profession;

  Score score;
  String ratingType;
  int ratingChange;
  String season;
}
