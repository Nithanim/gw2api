package me.nithanim.gw2api.v2.api.minis;

import com.sun.jersey.api.client.WebResource;
import me.nithanim.gw2api.v2.util.rest.IdsResourceBase;

public class MinisResourceImpl extends IdsResourceBase<Mini, int[]> implements MinisResource {
    public MinisResourceImpl(WebResource webResource) {
        super(webResource.path("minis"), Mini.class, int[].class);
    }
}
