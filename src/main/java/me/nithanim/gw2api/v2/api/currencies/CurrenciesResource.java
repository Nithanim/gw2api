package me.nithanim.gw2api.v2.api.currencies;

import java.util.List;

import me.nithanim.gw2api.v2.Language;

/**
 * This resource returns a list of the currencies contained in the account wallet.
 *
 * @see <a href="https://wiki.guildwars2.com/wiki/API:2/files">GW2Wiki</a>
 */
public interface CurrenciesResource {
  /** This endpoint will return an array of ids for each type of currency. */
  int[] getOverview();

  /**
   * This endpoint returns data for the currency id specified.
   *
   * <p>Notes: It is unspecified how the server determines the language of the response. For
   * specifying a language use {@link #get(int, Language)} instead.
   */
  Currency get(int id);

  /** This endpoint returns data for the currency id specified. */
  Currency get(int id, Language lang);

  /** Returns the data for all specified ids. */
  List<Currency> get(int[] ids);

  /** Returns the data for all specified ids. */
  List<Currency> get(int[] ids, Language lang);

  List<Currency> getAll();

  List<Currency> getAll(Language lang);
}
