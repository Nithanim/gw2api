package me.nithanim.gw2api.v2.api.commerce.prices;

import com.sun.jersey.api.client.WebResource;
import me.nithanim.gw2api.v2.util.rest.IdsResourceBase;

public class PricesResourceImpl extends IdsResourceBase<ItemPrice, int[]> implements PricesResource {
    public PricesResourceImpl(WebResource commerceResource) {
        super(commerceResource.path("prices"), ItemPrice.class, int[].class);
    }
}
