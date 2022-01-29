package me.nithanim.gw2api.v2.api.commerce.listings;

import javax.ws.rs.client.WebTarget;

import me.nithanim.gw2api.v2.util.rest.IdsResourceBase;

/**
 * This resource returns current buy and sell listings from the trading post.
 *
 * @see <a
 *     href="https://wiki.guildwars2.com/wiki/API:2/commerce/listings">https://wiki.guildwars2.com/wiki/API:2/commerce/listings</a>
 */
public class ListingsResourceImpl extends IdsResourceBase<Listing, int[]>
    implements ListingsResource {
  public ListingsResourceImpl(WebTarget commerceWebTarget) {
    super(commerceWebTarget.path("listings"), Listing.class, int[].class);
  }
}
