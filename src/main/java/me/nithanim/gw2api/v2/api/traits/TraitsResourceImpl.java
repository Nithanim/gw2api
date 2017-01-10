package me.nithanim.gw2api.v2.api.traits;

import javax.ws.rs.client.WebTarget;
import me.nithanim.gw2api.v2.util.rest.IdsResourceBase;

public class TraitsResourceImpl extends IdsResourceBase<Trait, int[]> implements TraitsResource {
    public TraitsResourceImpl(WebTarget webTarget) {
        super(webTarget.path("traits"), Trait.class, int[].class);
    }
}
