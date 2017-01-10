package me.nithanim.gw2api.v2.api.continents.floors.regions;

import javax.ws.rs.client.WebTarget;
import me.nithanim.gw2api.v2.api.continents.floors.regions.maps.MapsResource;
import me.nithanim.gw2api.v2.api.continents.floors.regions.maps.MapsResourceImpl;
import me.nithanim.gw2api.v2.util.rest.IdsResourceBase;

public class RegionsResourceImpl extends IdsResourceBase<Region, int[]> implements RegionsResource {
    private final MapsResource mapsResource;
    
    public RegionsResourceImpl(WebTarget webTarget) {
        super(webTarget.path("continents"), Region.class, int[].class);
        mapsResource = new MapsResourceImpl(super.webTarget);
    }

    @Override
    public MapsResource maps() {
        return mapsResource;
    }
}
