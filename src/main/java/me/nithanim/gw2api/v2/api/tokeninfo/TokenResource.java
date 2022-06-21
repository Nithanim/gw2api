package me.nithanim.gw2api.v2.api.tokeninfo;

import me.nithanim.gw2api.v2.ApiEndpoint;
/**
 * This resource returns information about the supplied API key.
 *
 * @see <a href="https://wiki.guildwars2.com/wiki/API:2/tokeninfo">GW2Wiki</a>
 */
public interface TokenResource extends ApiEndpoint {
  TokenInfo get(String apikey);
}
