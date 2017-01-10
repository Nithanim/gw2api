package me.nithanim.gw2api.v2.api.items;

import javax.ws.rs.client.WebTarget;
import me.nithanim.gw2api.v2.util.rest.IdsResourceBase;

public class ItemsResourceImpl extends IdsResourceBase<ItemInfo, int[]> implements ItemsResource {

    public ItemsResourceImpl(WebTarget webTarget) {
        super(webTarget.path("items"), ItemInfo.class, int[].class);
    }

}
