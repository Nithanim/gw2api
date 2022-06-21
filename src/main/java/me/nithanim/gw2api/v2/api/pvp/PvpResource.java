package me.nithanim.gw2api.v2.api.pvp;

import javax.ws.rs.client.WebTarget;

import org.jboss.resteasy.client.jaxrs.ProxyConfig;

import me.nithanim.gw2api.v2.ApiMidpoint;
import me.nithanim.gw2api.v2.api.pvp.games.GamesResource;
import me.nithanim.gw2api.v2.api.pvp.games.GamesResourceImpl;
import me.nithanim.gw2api.v2.api.pvp.games.GamesResourceWs;
import me.nithanim.gw2api.v2.api.pvp.stats.StatsResource;

public class PvpResource implements ApiMidpoint {
  private final GamesResource gamesResource;
  private final StatsResource statsResource;

  public PvpResource(WebTarget webTarget, GamesResourceWs grws) {
    webTarget = webTarget.path("pvp");
    gamesResource = new GamesResourceImpl(grws);
    statsResource = new StatsResource(webTarget);
  }

  /**
   * https://wiki.guildwars2.com/wiki/API:2/pvp/games
   *
   * @return
   */
  public GamesResource games() {
    return gamesResource;
  }

  /**
   * https://wiki.guildwars2.com/wiki/API:2/pvp/stats
   *
   * @return
   */
  public StatsResource stats() {
    return statsResource;
  }
}
