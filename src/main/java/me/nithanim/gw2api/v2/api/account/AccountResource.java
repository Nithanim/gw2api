package me.nithanim.gw2api.v2.api.account;

import com.sun.jersey.api.client.WebResource;
import me.nithanim.gw2api.v2.ApiEndpoint;
import me.nithanim.gw2api.v2.ApiMidpoint;
import me.nithanim.gw2api.v2.common.Item;
import me.nithanim.gw2api.v2.util.rest.RequestHelper;

/**
 * This resource returns information about player accounts. This endpoint is
 * only accessible with a valid API key.
 *
 * @see
 * <a href="https://wiki.guildwars2.com/wiki/API:2/account">https://wiki.guildwars2.com/wiki/API:2/account</a>
 */
public class AccountResource implements ApiMidpoint, ApiEndpoint {
    private final WebResource achievementsWebResource;
    private final WebResource webResource;
    private final WebResource bankWebResource;
    private final WebResource dyesWebResource;
    private final WebResource materialsWebResource;
    private final WebResource minisWebResource;
    private final WebResource skinsWebResource;
    private final WebResource walletWebResource;

    public AccountResource(WebResource webResource) {
        this.webResource = webResource.path("account");
        this.achievementsWebResource = this.webResource.path("achievements");
        this.bankWebResource = this.webResource.path("bank");
        this.dyesWebResource = this.webResource.path("dyes");
        this.materialsWebResource = this.webResource.path("materials");
        this.minisWebResource = this.webResource.path("minis");
        this.skinsWebResource = this.webResource.path("skins");
        this.walletWebResource = this.webResource.path("wallet");
    }

    /**
     * This resource returns the achievements of the account. This endpoint is
     * only accessible with a valid API key.
     *
     * @param apiKey
     * @return
     */
    public AchievementStatus[] achievements(String apiKey) {
        return RequestHelper.INSTANCE.getRequest(achievementsWebResource, apiKey, AchievementStatus[].class);
    }

    /**
     * This resource returns information about player accounts. This endpoint is
     * only accessible with a valid API key.
     *
     * @param apiKey
     * @return
     */
    public Account get(String apiKey) {
        return RequestHelper.INSTANCE.getRequest(webResource, apiKey, Account.class);
    }

    /**
     * The endpoint returns an array of objects, each representing an item slot
     * in the vault. If a slot is empty, it will return null. The amount of
     * slots/bank tabs is implied by the length of the array.
     *
     * @param apiKey
     * @return
     * @see
     * <a href="https://wiki.guildwars2.com/wiki/API:2/account/bank">https://wiki.guildwars2.com/wiki/API:2/account/bank</a>
     */
    public Item[] bank(String apiKey) {
        return RequestHelper.INSTANCE.getRequest(bankWebResource, apiKey, Item[].class);
    }

    /**
     * This resource returns the unlocked dyes of the account. This endpoint is
     * only accessible with a valid API key.
     *
     * @param apiKey
     * @return
     */
    public int[] dyes(String apiKey) {
        return RequestHelper.INSTANCE.getRequest(dyesWebResource, apiKey, int[].class);
    }

    /**
     * This resource returns the materials stored in a player's vault. This
     * endpoint is only accessible with a valid API key.
     *
     * @param apiKey
     * @return
     */
    public Item[] materials(String apiKey) {
        return RequestHelper.INSTANCE.getRequest(materialsWebResource, apiKey, Item[].class);
    }

    /**
     * This resource returns the minis of the account. This endpoint is only
     * accessible with a valid API key.
     *
     * @param apiKey
     * @return
     */
    public int[] minis(String apiKey) {
        return RequestHelper.INSTANCE.getRequest(minisWebResource, apiKey, int[].class);
    }

    /**
     * This resource returns the unlocked skins of the account. This endpoint is
     * only accessible with a valid API key.
     *
     * @param apiKey
     * @return
     */
    public int[] skins(String apiKey) {
        return RequestHelper.INSTANCE.getRequest(skinsWebResource, apiKey, int[].class);
    }

    /**
     * This resource returns the currencies of the account. This endpoint is
     * only accessible with a valid API key.
     *
     * @param apiKey
     * @return
     */
    public CurrencyBelonging[] wallet(String apiKey) {
        return RequestHelper.INSTANCE.getRequest(walletWebResource, apiKey, CurrencyBelonging[].class);
    }
}
