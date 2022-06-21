package me.nithanim.gw2api.v2.api.pvp.games;

import javax.ws.rs.Path;

import me.nithanim.gw2api.v2.util.rest.IdsResourceWsInt;
import me.nithanim.gw2api.v2.util.rest.IdsResourceWsObj;

@Path("pvp/games")
public interface GamesResourceWs extends IdsResourceWsObj<String, Game> {}
