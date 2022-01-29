package me.nithanim.gw2api.v2.api.continents.floors.regions;

import me.nithanim.gw2api.v2.ApiEndpoint;
import me.nithanim.gw2api.v2.ApiMidpoint;
import me.nithanim.gw2api.v2.api.continents.floors.regions.maps.MapsResource;

public interface RegionsResource extends ApiEndpoint, ApiMidpoint {
  int[] getOverview();

  Region get(int id);

  Region get(int id, String language);

  Region[] get(int[] id);

  Region[] get(int[] id, String language);

  Region[] getAll();

  Region[] getAll(String language);

  MapsResource maps();
}
