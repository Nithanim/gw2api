package me.nithanim.gw2api.v2.api.continents;

import me.nithanim.gw2api.v2.api.continents.floors.FloorsResource;
import me.nithanim.gw2api.v2.ApiEndpoint;
import me.nithanim.gw2api.v2.ApiMidpoint;

public interface ContinentsResource extends ApiEndpoint, ApiMidpoint {
    int[] getOverview();

    Continent get(int id);

    Continent get(int id, String language);

    Continent[] get(int[] ids);

    Continent[] get(int[] ids, String language);

    Continent[] getAll();

    Continent[] getAll(String language);
    
    FloorsResource floors(int continentId);
}
