package me.nithanim.gw2api.v2.api.commerce.prices;

import me.nithanim.gw2api.v2.ApiEndpoint;

/**
 * This resource returns current aggregated buy and sell listing information
 * from the trading post.
 */
public interface PricesResource extends ApiEndpoint {
    /**
     * A list with all possible ids.
     *
     * @return
     */
    int[] getOverview();

    ItemPrice get(int id);

    ItemPrice[] get(int[] ids);
}
