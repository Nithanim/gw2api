package me.nithanim.gw2api.v2.api.maps;

import com.sun.jersey.api.client.WebResource;
import me.nithanim.gw2api.v2.util.rest.IdsResourceBase;

public class MapsResourceImpl extends IdsResourceBase<Map, int[]> implements MapsResource {
    public MapsResourceImpl(WebResource webResource) {
        super(webResource.path("maps"), Map.class, int [].class);
    }
}
