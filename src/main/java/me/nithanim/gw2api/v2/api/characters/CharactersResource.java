package me.nithanim.gw2api.v2.api.characters;

import java.util.List;

import me.nithanim.gw2api.v2.ApiEndpoint;

/** This resource returns information about characters attached to a specific account. */
public interface CharactersResource extends ApiEndpoint {
  List<String> getOverview(String apiKey);

  Character get(String character, String apiKey);
}
