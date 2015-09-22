package me.nithanim.gw2api.v2.api.items;

import com.sun.jersey.api.client.WebResource;
import me.nithanim.gw2api.v2.util.rest.IdsResourceBase;

public class ItemsResourceImpl extends IdsResourceBase<ItemInfo, int[]> implements ItemsResource {

    public ItemsResourceImpl(WebResource webResource) {
        super(webResource.path("items"), ItemInfo.class, int[].class);
    }

}
