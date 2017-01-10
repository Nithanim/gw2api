package me.nithanim.gw2api.v2.api.pvp.stats;

import javax.ws.rs.client.WebTarget;
import me.nithanim.gw2api.v2.util.rest.RequestHelper;

public class StatsResource {
    private final WebTarget webTarget;

    public StatsResource(WebTarget webResource) {
        this.webTarget = webResource.path("stats");
    }

    public String[] getOverview(String apiKey) {
        return RequestHelper.INSTANCE.getRequest(webTarget, apiKey, String[].class);
    }

    public Stat get(String apiKey) {
        return RequestHelper.INSTANCE.getRequest(
            webTarget,
            apiKey,
            Stat.class
        );
    }
}
