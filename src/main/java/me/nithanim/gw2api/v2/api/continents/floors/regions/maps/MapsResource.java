package me.nithanim.gw2api.v2.api.continents.floors.regions.maps;

import me.nithanim.gw2api.v2.ApiEndpoint;

public interface MapsResource extends ApiEndpoint {
  int[] getOverview();

  Map get(int id);

  Map get(int id, String language);

  Map[] get(int[] id);

  Map[] get(int[] id, String language);

  Map[] getAll();

  Map[] getAll(String language);
}
