package me.nithanim.gw2api.v2.api.continents.floors;

import me.nithanim.gw2api.v2.ApiEndpoint;
import me.nithanim.gw2api.v2.ApiMidpoint;
import me.nithanim.gw2api.v2.api.continents.floors.regions.RegionsResource;
import me.nithanim.gw2api.v2.common.Language;

public interface FloorsResource extends ApiEndpoint, ApiMidpoint {
    int[] getOverview();

    Floor get(int id);

    Floor get(int id, Language lang);

    Floor[] get(int[] id);

    Floor[] get(int[] id, Language lang);

    Floor[] getAll();

    Floor[] getAll(Language lang);

    RegionsResource regions(int floorId);
}
