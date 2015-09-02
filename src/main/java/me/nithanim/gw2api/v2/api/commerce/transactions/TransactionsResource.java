package me.nithanim.gw2api.v2.api.commerce.transactions;

import me.nithanim.gw2api.v2.api.commerce.exchange.Transaction;
import com.sun.jersey.api.client.WebResource;
import me.nithanim.gw2api.v2.ApiEndpoint;
import me.nithanim.gw2api.v2.util.rest.RequestHelper;

/**
 * This resource provides access to the current and historical transactions of a
 * player. This is an authenticated endpoint. Results are cached for five
 * minutes.
 *
 * @see
 * <a href="https://wiki.guildwars2.com/wiki/API:2/commerce/transactions">https://wiki.guildwars2.com/wiki/API:2/commerce/transactions</a>
 */
public class TransactionsResource implements ApiEndpoint {
    private final WebResource currentBuys;
    private final WebResource historySells;
    private final WebResource historyBuys;
    private final WebResource currentSells;

    public TransactionsResource(WebResource commerceWebResource) {
        WebResource ws = commerceWebResource.path("transactions");
        WebResource current = ws.path("current");
        WebResource history = ws.path("history");

        currentBuys = current.path("buys");
        currentSells = current.path("sells");
        historyBuys = history.path("buys");
        historySells = history.path("sells");
    }

    public Transaction[] currentBuys(String apiKey) {
        return RequestHelper.getRequest(currentBuys, apiKey, Transaction[].class);
    }

    public Transaction[] currentSells(String apiKey) {
        return RequestHelper.getRequest(currentSells, apiKey, Transaction[].class);
    }

    public Transaction[] historyBuys(String apiKey) {
        return RequestHelper.getRequest(historyBuys, apiKey, Transaction[].class);
    }

    public Transaction[] historySells(String apiKey) {
        return RequestHelper.getRequest(historySells, apiKey, Transaction[].class);
    }
}
