package me.nithanim.gw2api.v2.api.pvp.games;

import com.sun.jersey.api.client.WebResource;
import me.nithanim.gw2api.v2.util.rest.DataUtil;
import me.nithanim.gw2api.v2.util.rest.RequestHelper;

public class GamesResource {
    private final WebResource webResource;

    public GamesResource(WebResource webResource) {
        this.webResource = webResource.path("games");
    }

    public String[] getOverview(String apiKey) {
        return RequestHelper.INSTANCE.getRequest(webResource, apiKey, String[].class);
    }

    public Game get(String id, String apiKey) {
        return RequestHelper.INSTANCE.getRequest(
            webResource,
            apiKey,
            Game.class,
            "id", id
        );
    }

    public Game[] get(String[] ids, String apiKey) {
        return RequestHelper.INSTANCE.getRequest(
            webResource,
            apiKey,
            Game[].class,
            "ids", DataUtil.stringstsToCommaSeparatedString(ids)
        );
    }
}
