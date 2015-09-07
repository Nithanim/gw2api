package me.nithanim.gw2api.v2.api.worlds;

import com.sun.jersey.api.client.WebResource;
import me.nithanim.gw2api.v2.util.rest.IdsResourceBase;

public class WorldsResourceImpl extends IdsResourceBase<World, int[]> implements WorldsResource {
    public WorldsResourceImpl(WebResource webResource) {
        super(webResource.path("worlds"), World.class, int[].class);
    }
}
