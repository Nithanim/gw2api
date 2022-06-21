package me.nithanim.gw2api.v2.api.pvp.games;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class Score {
  @Builder.Default int red = -1;
  @Builder.Default int blue = -1;
}
