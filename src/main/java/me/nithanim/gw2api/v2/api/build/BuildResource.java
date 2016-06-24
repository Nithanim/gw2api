package me.nithanim.gw2api.v2.api.build;

import com.sun.jersey.api.client.WebResource;
import me.nithanim.gw2api.v2.ApiEndpoint;
import me.nithanim.gw2api.v2.util.rest.RequestHelper;

/**
 * This resource returns the current build id of the game. This can be used, for
 * example, to register when event timers reset due to server restarts.
 *
 * @see
 * <a href="https://wiki.guildwars2.com/wiki/API:2/build">https://wiki.guildwars2.com/wiki/API:2/build</a>
 */
public class BuildResource implements ApiEndpoint {
    private final WebResource webResource;

    public BuildResource(WebResource webResource) {
        this.webResource = webResource.path("build");
    }

    /**
     * The response is an object with the single property id containing the
     * current build id as a number.
     *
     * @return the current build number
     */
    public Build get() {
        return RequestHelper.INSTANCE.getRequest(webResource, Build.class);
    }
}
