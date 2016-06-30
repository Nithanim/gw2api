package me.nithanim.gw2api.v2.api.commerce.transactions;

import com.sun.jersey.api.client.WebResource;
import me.nithanim.gw2api.v2.ApiEndpoint;
import me.nithanim.gw2api.v2.util.rest.PaginationResult;
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
        return RequestHelper.INSTANCE.getRequest(currentBuys, apiKey, Transaction[].class);
    }

    public PaginationResult<Transaction[]> currentBuysExtendedWithPage(String apiKey, int page) {
        return queryApiWithPage(currentBuys, apiKey, page);
    }

    public PaginationResult<Transaction[]> currentBuysExtendedWithPageSize(String apiKey, int pageSize) {
        return queryApiWithPageSize(currentBuys, apiKey, pageSize);
    }

    public PaginationResult<Transaction[]> currentBuysExtendedWithPageAndPageSize(String apiKey, int page, int pageSize) {
        return queryApiWithPageAndPageSize(currentBuys, apiKey, page, pageSize);
    }

    public Transaction[] currentSells(String apiKey) {
        return RequestHelper.INSTANCE.getRequest(currentSells, apiKey, Transaction[].class);
    }

    public PaginationResult<Transaction[]> currentSellsExtendedWithPage(String apiKey, int page) {
        return queryApiWithPage(currentSells, apiKey, page);
    }

    public PaginationResult<Transaction[]> currentSellsExtendedWithPageSize(String apiKey, int pageSize) {
        return queryApiWithPageSize(currentSells, apiKey, pageSize);
    }

    public PaginationResult<Transaction[]> currentSellsExtendedWithPageAndPageSize(String apiKey, int page, int pageSize) {
        return queryApiWithPageAndPageSize(currentSells, apiKey, page, pageSize);
    }

    public Transaction[] historyBuys(String apiKey) {
        return RequestHelper.INSTANCE.getRequest(historyBuys, apiKey, Transaction[].class);
    }

    public PaginationResult<Transaction[]> historyBuysExtendedWithPage(String apiKey, int page) {
        return queryApiWithPage(historyBuys, apiKey, page);
    }

    public PaginationResult<Transaction[]> historyBuysExtendedWithPageSize(String apiKey, int pageSize) {
        return queryApiWithPageSize(historyBuys, apiKey, pageSize);
    }

    public PaginationResult<Transaction[]> historyBuysExtendedWithPageAndPageSize(String apiKey, int page, int pageSize) {
        return queryApiWithPageAndPageSize(historyBuys, apiKey, page, pageSize);
    }

    public Transaction[] historySells(String apiKey) {
        return RequestHelper.INSTANCE.getRequest(historySells, apiKey, Transaction[].class);
    }

    public PaginationResult<Transaction[]> historySellsExtendedWithPage(String apiKey, int page) {
        return queryApiWithPage(historySells, apiKey, page);
    }

    public PaginationResult<Transaction[]> historySellsExtendedWithPageSize(String apiKey, int pageSize) {
        return queryApiWithPageSize(historySells, apiKey, pageSize);
    }

    public PaginationResult<Transaction[]> historySellsExtendedWithPageAndPageSize(String apiKey, int page, int pageSize) {
        return queryApiWithPageAndPageSize(historySells, apiKey, page, pageSize);
    }

    private PaginationResult<Transaction[]> queryApiWithPage(WebResource wr, String apiKey, int page) {
        return RequestHelper.INSTANCE.getRequestExtended(
            wr,
            apiKey,
            Transaction[].class,
            "page", String.valueOf(page)
        );
    }

    private PaginationResult<Transaction[]> queryApiWithPageSize(WebResource wr, String apiKey, int pageSize) {
        return RequestHelper.INSTANCE.getRequestExtended(
            wr,
            apiKey,
            Transaction[].class,
            "page_size", String.valueOf(pageSize)
        );
    }

    private PaginationResult<Transaction[]> queryApiWithPageAndPageSize(WebResource wr, String apiKey, int page, int pageSize) {
        return RequestHelper.INSTANCE.getRequestExtended(
            wr,
            apiKey,
            Transaction[].class,
            "page", String.valueOf(page),
            "page_size", String.valueOf(pageSize)
        );
    }
}
