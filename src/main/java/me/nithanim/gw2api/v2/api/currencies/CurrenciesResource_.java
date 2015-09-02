package me.nithanim.gw2api.v2.api.currencies;

import com.sun.jersey.api.client.WebResource;
import me.nithanim.gw2api.v2.ApiEndpoint;
import me.nithanim.gw2api.v2.util.rest.DataUtil;
import me.nithanim.gw2api.v2.util.rest.RequestHelper;

/**
 * This resource returns a list of the currencies contained in the account
 * wallet.
 *
 * @see
 * <a href="https://wiki.guildwars2.com/wiki/API:2/files">GW2Wiki</a>
 */
class CurrenciesResource_ implements ApiEndpoint {
    private final WebResource webResource;

    public CurrenciesResource_(WebResource webResource) {
        this.webResource = webResource.path("currencies");
    }

    /**
     * This endpoint will return an array of ids for each type of currency.
     *
     * @return
     */
    public int[] getOverview() {
        return RequestHelper.getRequest(webResource, int[].class);
    }

    /**
     * This endpoint returns data for the curreny id specified.
     *
     * <p>
     * Notes: It is unspecified how the server determines the language of the
     * response. For specifying a language use
     * {@link #get(int, java.lang.String)} instead.</p>
     *
     *
     * @param id the id of the currency
     * @return
     */
    public Currency get(int id) {
        return RequestHelper.getRequest(webResource.path(String.valueOf(id)), Currency.class);
    }

    /**
     * This endpoint returns data for the curreny id specified.
     *
     * @param id the id of the currency
     * @param language the language in which the response should be returned
     * @return
     */
    public Currency get(int id, String language) {
        return RequestHelper.getRequest(webResource.path(String.valueOf(id)), Currency.class, "lang", language);
    }

    /**
     * Returns the data for all specified ids.
     * 
     * @param ids
     * @param language
     * @return 
     */
    public Currency[] get(int[] ids, String language) {
        return RequestHelper.getRequest(webResource, Currency[].class, "ids", DataUtil.intsToCommaSeparatedString(ids), "lang", language);
    }
}
