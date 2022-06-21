package me.nithanim.gw2api.v2.api.maps;

import java.util.List;

public interface MapsResource {
  int[] getOverview();

  WorldMap get(int id);

  WorldMap get(int id, String lang);

  List<WorldMap> get(int[] id);

  List<WorldMap> get(int[] id, String lang);

  List<WorldMap> getAll();

  List<WorldMap> getAll(String lang);
}
