package me.nithanim.gw2api.v2.api.tokeninfo;

import javax.ws.rs.client.WebTarget;

import me.nithanim.gw2api.v2.ApiEndpoint;
import me.nithanim.gw2api.v2.util.rest.RequestHelper;

/**
 * This resource returns information about the supplied API key.
 *
 * @see <a href="https://wiki.guildwars2.com/wiki/API:2/tokeninfo">GW2Wiki</a>
 */
public class TokenResource implements ApiEndpoint {
  private final WebTarget webTarget;

  public TokenResource(WebTarget webResource) {
    this.webTarget = webResource.path("tokeninfo");
  }

  public TokenInfo get(String apikey) {
    return RequestHelper.INSTANCE.getRequest(webTarget, apikey, TokenInfo.class);
  }
}
