package me.nithanim.gw2api.v2.api.commerce;

import javax.ws.rs.client.WebTarget;

import me.nithanim.gw2api.v2.ApiMidpoint;
import me.nithanim.gw2api.v2.api.commerce.exchange.ExchangeResource;
import me.nithanim.gw2api.v2.api.commerce.listings.ListingsResource;
import me.nithanim.gw2api.v2.api.commerce.listings.ListingsResourceImpl;
import me.nithanim.gw2api.v2.api.commerce.prices.PricesResource;
import me.nithanim.gw2api.v2.api.commerce.prices.PricesResourceImpl;
import me.nithanim.gw2api.v2.api.commerce.transactions.TransactionsResource;

public class CommerceResource implements ApiMidpoint {
  private final ExchangeResource exchange;
  private final ListingsResource listings;
  private final PricesResource prices;
  private final TransactionsResource transactions;

  public CommerceResource(WebTarget webTarget) {
    WebTarget commerceWebTarget = webTarget.path("commerce");
    exchange = new ExchangeResource(commerceWebTarget);
    listings = new ListingsResourceImpl(commerceWebTarget);
    prices = new PricesResourceImpl(commerceWebTarget);
    transactions = new TransactionsResource(commerceWebTarget);
  }

  /**
   * This resource provides acces to the gem exchange rate.
   *
   * @return
   */
  public ExchangeResource exchange() {
    return exchange;
  }

  /**
   * This resource returns current buy and sell listings from the trading post.
   *
   * @return
   */
  public ListingsResource listings() {
    return listings;
  }

  /**
   * This resource returns current aggregated buy and sell listing information from the trading
   * post.
   *
   * @return
   */
  public PricesResource prices() {
    return prices;
  }

  /**
   * This resource provides access to the current and historical transactions of a player. This is
   * an authenticated endpoint. Results are cached for five minutes.
   *
   * @return
   */
  public TransactionsResource transactions() {
    return transactions;
  }
}
