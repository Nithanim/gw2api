package me.nithanim.gw2api.v2.api.continents;

import me.nithanim.gw2api.v2.api.continents.floors.FloorsResource;
import me.nithanim.gw2api.v2.ApiEndpoint;
import me.nithanim.gw2api.v2.ApiMidpoint;
import me.nithanim.gw2api.v2.common.Language;

public interface ContinentsResource extends ApiEndpoint, ApiMidpoint {
    int[] getOverview();

    Continent get(int id);

    Continent get(int id, Language lang);

    Continent[] get(int[] ids);

    Continent[] get(int[] ids, Language lang);

    Continent[] getAll();

    Continent[] getAll(Language lang);

    FloorsResource floors(int continentId);
}
