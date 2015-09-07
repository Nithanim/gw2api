package me.nithanim.gw2api.v2.api.traits;

import com.sun.jersey.api.client.WebResource;
import me.nithanim.gw2api.v2.util.rest.IdsResourceBase;

public class TraitsResourceImpl extends IdsResourceBase<Trait, int[]> implements TraitsResource {
    public TraitsResourceImpl(WebResource webResource) {
        super(webResource.path("traits"), Trait.class, int[].class);
    }
}
