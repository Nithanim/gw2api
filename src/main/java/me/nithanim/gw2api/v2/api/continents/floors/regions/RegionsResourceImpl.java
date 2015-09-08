package me.nithanim.gw2api.v2.api.continents.floors.regions;

import com.sun.jersey.api.client.WebResource;
import me.nithanim.gw2api.v2.api.continents.floors.regions.maps.MapsResource;
import me.nithanim.gw2api.v2.api.continents.floors.regions.maps.MapsResourceImpl;
import me.nithanim.gw2api.v2.util.rest.IdsResourceBase;

public class RegionsResourceImpl extends IdsResourceBase<Region, int[]> implements RegionsResource {
    private final MapsResource mapsResource;
    
    public RegionsResourceImpl(WebResource webResource) {
        super(webResource.path("continents"), Region.class, int[].class);
        mapsResource = new MapsResourceImpl(super.webResource);
    }

    @Override
    public MapsResource maps() {
        return mapsResource;
    }
}
