package me.nithanim.gw2api.v2.api.currencies;

import javax.ws.rs.Path;

import me.nithanim.gw2api.v2.util.rest.IdsResourceWsInt;

@Path("currencies")
public interface CurrenciesResourceWs extends IdsResourceWsInt<Currency> {}
