package me.nithanim.gw2api.v2.api.commerce.exchange;

import javax.ws.rs.client.WebTarget;

import me.nithanim.gw2api.v2.ApiEndpoint;
import me.nithanim.gw2api.v2.util.rest.RequestHelper;

/**
 * This resource returns a list of accepted resources for the gem exchange.
 *
 * @see <a
 *     href="https://wiki.guildwars2.com/wiki/API:2/commerce/exchange">https://wiki.guildwars2.com/wiki/API:2/commerce/exchange</a>
 */
public class ExchangeResource implements ApiEndpoint {
  private final WebTarget coinsWebTarget;
  private final WebTarget gemsWebTarget;

  public ExchangeResource(WebTarget commerceWebTarget) {
    WebTarget ws = commerceWebTarget.path("exchange");
    coinsWebTarget = ws.path("coins");
    gemsWebTarget = ws.path("gems");
  }

  /**
   * This resource returns the current coins to gems exchange rate.
   *
   * @param quantity the amount of coins to exchange for gems.
   * @return
   */
  public CoinsPerGem coinsPerGem(int quantity) {
    return RequestHelper.INSTANCE.getRequest(
        coinsWebTarget, CoinsPerGem.class, "quantity", String.valueOf(quantity));
  }

  /**
   * This resource returns the current gem to coins exchange rate.
   *
   * @param quantity the amount of gems to exchange for coins.
   * @return
   */
  public CoinsPerGem gemsPerCoin(int quantity) {
    return RequestHelper.INSTANCE.getRequest(
        gemsWebTarget, CoinsPerGem.class, "quantity", String.valueOf(quantity));
  }

  @lombok.NoArgsConstructor
  @lombok.AllArgsConstructor
  @lombok.Getter
  @lombok.EqualsAndHashCode
  @lombok.ToString
  public static class CoinsPerGem {
    private double coinsPerGem;
    private int quantiy;
  }
}
