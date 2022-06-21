package me.nithanim.gw2api.v2.api.minis;

import javax.ws.rs.Path;

import me.nithanim.gw2api.v2.api.currencies.Currency;
import me.nithanim.gw2api.v2.util.rest.IdsResourceWsInt;

@Path("minis")
public interface MinisResourceWs extends IdsResourceWsInt<Mini> {}
