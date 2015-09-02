package me.nithanim.gw2api.v2.api.skins;

import me.nithanim.gw2api.v2.api.tokeninfo.*;
import com.sun.jersey.api.client.WebResource;
import me.nithanim.gw2api.v2.ApiEndpoint;
import me.nithanim.gw2api.v2.util.rest.RequestHelper;

/**
 * This resource returns information about skins that were discovered by players in the game. 
 *
 * @see
 * <a href="https://wiki.guildwars2.com/wiki/API:2/skins">GW2Wiki</a>
 */
public class SkinsResource implements ApiEndpoint {
    private final WebResource webResource;

    public SkinsResource(WebResource webResource) {
        this.webResource = webResource.path("tokeninfo");
    }

    public TokenInfo get(String apikey) {
        return RequestHelper.getRequest(webResource, apikey, TokenInfo.class);
    }
}
