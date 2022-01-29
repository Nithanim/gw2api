package me.nithanim.gw2api.v2.api.maps;

public interface MapsResource {
  int[] getOverview();

  Map get(int id);

  Map get(int id, String language);

  Map[] get(int[] id);

  Map[] get(int[] id, String language);
}
