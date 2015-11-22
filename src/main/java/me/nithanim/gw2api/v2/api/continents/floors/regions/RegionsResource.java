package me.nithanim.gw2api.v2.api.continents.floors.regions;

import me.nithanim.gw2api.v2.ApiEndpoint;
import me.nithanim.gw2api.v2.ApiMidpoint;
import me.nithanim.gw2api.v2.api.continents.floors.regions.maps.MapsResource;
import me.nithanim.gw2api.v2.common.Language;

public interface RegionsResource extends ApiEndpoint, ApiMidpoint {
    int[] getOverview();

    Region get(int id);

    Region get(int id, Language lang);

    Region[] get(int[] id);

    Region[] get(int[] id, Language lang);

    Region[] getAll();

    Region[] getAll(Language lang);

    MapsResource maps();
}
