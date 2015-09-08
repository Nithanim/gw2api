package me.nithanim.gw2api.v2.api.continents;

import com.sun.jersey.api.client.WebResource;
import me.nithanim.gw2api.v2.api.continents.floors.FloorsResource;
import me.nithanim.gw2api.v2.api.continents.floors.FloorsResourceImpl;
import me.nithanim.gw2api.v2.util.rest.IdsResourceBase;

public class ContinentsResourceImpl extends IdsResourceBase<Continent, int[]> implements ContinentsResource {
    public ContinentsResourceImpl(WebResource webResource) {
        super(webResource.path("continents"), Continent.class, int[].class);
    }

    @Override
    public FloorsResource floors(int continentId) {
        return new FloorsResourceImpl(webResource.path(String.valueOf(continentId)));
    }
}
