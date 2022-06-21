package me.nithanim.gw2api.v2.api.pvp.games;

import java.util.List;

import me.nithanim.gw2api.v2.ApiEndpoint;

public interface GamesResource extends ApiEndpoint {
  List<String> getOverview(String apiKey);

  Game get(String id, String apiKey);

  List<Game> get(List<String> ids, String apiKey);
}
