package me.nithanim.gw2api.v2.api.pvp;

import com.sun.jersey.api.client.WebResource;
import me.nithanim.gw2api.v2.ApiMidpoint;
import me.nithanim.gw2api.v2.api.pvp.games.GamesResource;
import me.nithanim.gw2api.v2.api.pvp.stats.StatsResource;

public class PvpResource implements ApiMidpoint {
    private final GamesResource gamesResource;
    private final StatsResource statsResource;

    public PvpResource(WebResource webResource) {
        webResource = webResource.path("pvp");
        gamesResource = new GamesResource(webResource);
        statsResource = new StatsResource(webResource);
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
