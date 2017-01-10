package me.nithanim.gw2api.v2.api.worlds;

import javax.ws.rs.client.WebTarget;
import me.nithanim.gw2api.v2.util.rest.IdsResourceBase;

public class WorldsResourceImpl extends IdsResourceBase<World, int[]> implements WorldsResource {
    public WorldsResourceImpl(WebTarget webTarget) {
        super(webTarget.path("worlds"), World.class, int[].class);
    }
}
