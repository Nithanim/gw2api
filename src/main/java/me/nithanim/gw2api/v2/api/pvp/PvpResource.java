package me.nithanim.gw2api.v2.api.pvp;

import com.sun.jersey.api.client.WebResource;
import me.nithanim.gw2api.v2.ApiMidpoint;
import me.nithanim.gw2api.v2.api.pvp.games.GamesResource;

public class PvpResource implements ApiMidpoint {
    private final GamesResource gamesResource;

    public PvpResource(WebResource webResource) {
        webResource = webResource.path("pvp");
        gamesResource = new GamesResource(webResource);
    }

    /**
     * https://wiki.guildwars2.com/wiki/API:2/pvp/games
     *
     * @return
     */
    public GamesResource games() {
        return gamesResource;
    }
}
