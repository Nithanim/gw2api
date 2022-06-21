package me.nithanim.gw2api.v2.api.maps;

import javax.ws.rs.Path;

import me.nithanim.gw2api.v2.api.minis.Mini;
import me.nithanim.gw2api.v2.util.rest.IdsResourceWsInt;

@Path("maps")
public interface MapsResourceWs extends IdsResourceWsInt<WorldMap> {}
