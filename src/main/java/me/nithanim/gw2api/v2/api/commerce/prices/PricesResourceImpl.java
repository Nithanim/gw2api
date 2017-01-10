package me.nithanim.gw2api.v2.api.commerce.prices;

import javax.ws.rs.client.WebTarget;
import me.nithanim.gw2api.v2.util.rest.IdsResourceBase;

public class PricesResourceImpl extends IdsResourceBase<ItemPrice, int[]> implements PricesResource {
    public PricesResourceImpl(WebTarget commerceResource) {
        super(commerceResource.path("prices"), ItemPrice.class, int[].class);
    }
}
