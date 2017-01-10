package me.nithanim.gw2api.v2.api.account;

import javax.ws.rs.client.WebTarget;
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
    private final WebTarget webTarget;
    private final WebTarget achievementsWebTarget;
    private final WebTarget bankWebTarget;
    private final WebTarget dyesWebTarget;
    private final WebTarget materialsWebTarget;
    private final WebTarget minisWebTarget;
    private final WebTarget skinsWebTarget;
    private final WebTarget walletWebTarget;

    public AccountResource(WebTarget webTarget) {
        this.webTarget = webTarget.path("account");
        this.achievementsWebTarget = this.webTarget.path("achievements");
        this.bankWebTarget = this.webTarget.path("bank");
        this.dyesWebTarget = this.webTarget.path("dyes");
        this.materialsWebTarget = this.webTarget.path("materials");
        this.minisWebTarget = this.webTarget.path("minis");
        this.skinsWebTarget = this.webTarget.path("skins");
        this.walletWebTarget = this.webTarget.path("wallet");
    }

    /**
     * This resource returns the achievements of the account. This endpoint is
     * only accessible with a valid API key.
     *
     * @param apiKey
     * @return
     */
    public AchievementStatus[] achievements(String apiKey) {
        return RequestHelper.INSTANCE.getRequest(achievementsWebTarget, apiKey, AchievementStatus[].class);
    }

    /**
     * This resource returns information about player accounts. This endpoint is
     * only accessible with a valid API key.
     *
     * @param apiKey
     * @return
     */
    public Account get(String apiKey) {
        return RequestHelper.INSTANCE.getRequest(webTarget, apiKey, Account.class);
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
        return RequestHelper.INSTANCE.getRequest(bankWebTarget, apiKey, Item[].class);
    }

    /**
     * This resource returns the unlocked dyes of the account. This endpoint is
     * only accessible with a valid API key.
     *
     * @param apiKey
     * @return
     */
    public int[] dyes(String apiKey) {
        return RequestHelper.INSTANCE.getRequest(dyesWebTarget, apiKey, int[].class);
    }

    /**
     * This resource returns the materials stored in a player's vault. This
     * endpoint is only accessible with a valid API key.
     *
     * @param apiKey
     * @return
     */
    public Item[] materials(String apiKey) {
        return RequestHelper.INSTANCE.getRequest(materialsWebTarget, apiKey, Item[].class);
    }

    /**
     * This resource returns the minis of the account. This endpoint is only
     * accessible with a valid API key.
     *
     * @param apiKey
     * @return
     */
    public int[] minis(String apiKey) {
        return RequestHelper.INSTANCE.getRequest(minisWebTarget, apiKey, int[].class);
    }

    /**
     * This resource returns the unlocked skins of the account. This endpoint is
     * only accessible with a valid API key.
     *
     * @param apiKey
     * @return
     */
    public int[] skins(String apiKey) {
        return RequestHelper.INSTANCE.getRequest(skinsWebTarget, apiKey, int[].class);
    }

    /**
     * This resource returns the currencies of the account. This endpoint is
     * only accessible with a valid API key.
     *
     * @param apiKey
     * @return
     */
    public CurrencyBelonging[] wallet(String apiKey) {
        return RequestHelper.INSTANCE.getRequest(walletWebTarget, apiKey, CurrencyBelonging[].class);
    }
}
