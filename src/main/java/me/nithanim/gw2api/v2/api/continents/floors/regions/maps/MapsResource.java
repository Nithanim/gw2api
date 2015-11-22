package me.nithanim.gw2api.v2.api.continents.floors.regions.maps;

import me.nithanim.gw2api.v2.ApiEndpoint;
import me.nithanim.gw2api.v2.common.Language;

public interface MapsResource extends ApiEndpoint {
    int[] getOverview();

    Map get(int id);

    Map get(int id, Language lang);

    Map[] get(int[] id);

    Map[] get(int[] id, Language lang);

    Map[] getAll();

    Map[] getAll(Language lang);
}
