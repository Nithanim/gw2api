package me.nithanim.gw2api.v2.api.commerce.exchange;

import com.sun.jersey.api.client.WebResource;
import me.nithanim.gw2api.v2.ApiEndpoint;
import me.nithanim.gw2api.v2.util.rest.RequestHelper;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * This resource returns a list of accepted resources for the gem exchange.
 *
 * @see
 * <a href="https://wiki.guildwars2.com/wiki/API:2/commerce/exchange">https://wiki.guildwars2.com/wiki/API:2/commerce/exchange</a>
 */
public class ExchangeResource implements ApiEndpoint {
    private final WebResource coinsWebResource;
    private final WebResource gemsWebResource;

    public ExchangeResource(WebResource commerceWebResource) {
        WebResource ws = commerceWebResource.path("exchange");
        coinsWebResource = ws.path("coins");
        gemsWebResource = ws.path("gems");
    }

    /**
     * This resource returns the current coins to gems exchange rate.
     *
     * @param quantity the amount of coins to exchange for gems.
     * @return
     */
    public CoinsPerGem coinsPerGem(int quantity) {
        return RequestHelper.getRequest(coinsWebResource, CoinsPerGem.class, "quantity", String.valueOf(quantity));
    }

    /**
     * This resource returns the current gem to coins exchange rate.
     *
     * @param quantity the amount of gems to exchange for coins.
     * @return
     */
    public CoinsPerGem gemsPerCoin(int quantity) {
        return RequestHelper.getRequest(gemsWebResource, CoinsPerGem.class, "quantity", String.valueOf(quantity));
    }

    public static class CoinsPerGem {
        private double coinsPerGem;
        private int quantiy;

        public double getCoinsPerGem() {
            return coinsPerGem;
        }

        public int getQuantiy() {
            return quantiy;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 37 * hash + (int) (Double.doubleToLongBits(this.coinsPerGem) ^ (Double.doubleToLongBits(this.coinsPerGem) >>> 32));
            hash = 37 * hash + this.quantiy;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            final CoinsPerGem other = (CoinsPerGem) obj;
            return Double.doubleToLongBits(this.coinsPerGem) == Double.doubleToLongBits(other.coinsPerGem)
                && this.quantiy == other.quantiy;
        }

        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this);
        }
    }
}
