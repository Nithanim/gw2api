package me.nithanim.gw2api.v2.api.pvp.stats;

import com.sun.jersey.api.client.WebResource;
import me.nithanim.gw2api.v2.util.rest.RequestHelper;

public class StatsResource {
    private final WebResource webResource;

    public StatsResource(WebResource webResource) {
        this.webResource = webResource.path("stats");
    }

    public String[] getOverview(String apiKey) {
        return RequestHelper.INSTANCE.getRequest(webResource, apiKey, String[].class);
    }

    public Stat get(String apiKey) {
        return RequestHelper.INSTANCE.getRequest(
            webResource,
            apiKey,
            Stat.class
        );
    }
}
