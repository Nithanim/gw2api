package me.nithanim.gw2api.v2.api.currencies;

import me.nithanim.gw2api.v2.common.Language;

/**
 * This resource returns a list of the currencies contained in the account
 * wallet.
 *
 * @see
 * <a href="https://wiki.guildwars2.com/wiki/API:2/files">GW2Wiki</a>
 */
public interface CurrenciesResource {
    /**
     * This endpoint will return an array of ids for each type of currency.
     *
     * @return
     */
    int[] getOverview();

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
    Currency get(int id);

    /**
     * This endpoint returns data for the curreny id specified.
     *
     * @param id the id of the currency
     * @param lang the language in which the response should be returned
     * @return
     */
    Currency get(int id, Language lang);

    /**
     * Returns the data for all specified ids.
     *
     * @param ids the ids of the currencies
     * @return
     */
    Currency[] get(int[] ids);

    /**
     * Returns the data for all specified ids.
     *
     * @param ids the ids of the currencies
     * @param lang the language in which the response should be returned
     * @return
     */
    Currency[] get(int[] ids, Language lang);

}
