package me.nithanim.gw2api.v2.api.currencies;

import javax.ws.rs.client.WebTarget;

import me.nithanim.gw2api.v2.util.rest.IdsResourceBase;

public class CurrenciesResourceImpl extends IdsResourceBase<Currency, int[]>
    implements CurrenciesResource {
  public CurrenciesResourceImpl(WebTarget webTarget) {
    super(webTarget.path("currencies"), Currency.class, int[].class);
  }
}
