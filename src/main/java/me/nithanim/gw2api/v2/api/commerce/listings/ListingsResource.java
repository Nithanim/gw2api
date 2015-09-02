package me.nithanim.gw2api.v2.api.commerce.listings;

import me.nithanim.gw2api.v2.ApiEndpoint;

public interface ListingsResource extends ApiEndpoint {
    /**
     * Returns an array of all available listings.
     *
     * @return
     */
    int[] getOverview();

    /**
     * Retrieves a single listing.
     *
     * @param id the item id for which the listings should be retrieved for
     * @return the listing for the requested item
     */
    Listing get(int id);

    /**
     * Retrieves multiple listings at once specified by their ids. Convenience
     * method for {@link #get(java.lang.String)}.
     *
     * @param ids the item ids the listings should be retrieved for
     * @return an array of the requested listings
     */
    Listing[] get(int[] ids);
}
