package me.nithanim.gw2api.v2.api.currencies;

import com.sun.jersey.api.client.WebResource;
import me.nithanim.gw2api.v2.util.rest.IdsResourceBase;


public class CurrenciesResourceImpl extends IdsResourceBase<Currency, int[]> implements CurrenciesResource {
    public CurrenciesResourceImpl(WebResource webResource) {
        super(webResource, "currencies", Currency.class, int[].class);
    }
}
