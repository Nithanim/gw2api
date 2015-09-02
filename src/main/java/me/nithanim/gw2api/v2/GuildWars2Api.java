package me.nithanim.gw2api.v2;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import me.nithanim.gw2api.v2.api.account.AccountResource;
import me.nithanim.gw2api.v2.api.colors.ColorsResource;
import me.nithanim.gw2api.v2.api.characters.CharactersResource;
import me.nithanim.gw2api.v2.api.colors.ColorsResourceImpl;
import me.nithanim.gw2api.v2.api.commerce.CommerceResource;
import me.nithanim.gw2api.v2.api.currencies.CurrenciesResource;
import me.nithanim.gw2api.v2.api.currencies.CurrenciesResourceImpl;
import me.nithanim.gw2api.v2.api.tokeninfo.TokenResource;
import me.nithanim.gw2api.v2.util.gson.EnumTypeAdapterFactory;
import me.nithanim.gw2api.v2.util.time.DateTimeAdapter;

public class GuildWars2Api {
    public static final Gson GSON = new GsonBuilder()
        .registerTypeAdapter(DateTimeAdapter.TYPE, new DateTimeAdapter())
        .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
        .registerTypeAdapterFactory(new EnumTypeAdapterFactory())
        .create();

    private final Client client;
    private final AccountResource accountResource;
    private final ColorsResource buildResource;
    private final CommerceResource commerceResource;
    private final CharactersResource charactersResource;
    private final ColorsResource colorResource;
    private final CurrenciesResource currenciesResource;
    private final TokenResource tokenResource;

    public GuildWars2Api() {
        this(new GuildWars2ApiDefaultConfig());
    }

    public GuildWars2Api(GuildWars2ApiConfig config) {
        ClientConfig clientConfig = new DefaultClientConfig();
        client = Client.create(clientConfig);
        WebResource baseWebResource = client.resource(config.getBaseUrl());

        accountResource = new AccountResource(baseWebResource);
        buildResource = new ColorsResourceImpl(baseWebResource);
        commerceResource = new CommerceResource(baseWebResource);
        charactersResource = new CharactersResource(baseWebResource);
        colorResource = new ColorsResourceImpl(baseWebResource);
        currenciesResource = new CurrenciesResourceImpl(baseWebResource);
        tokenResource = new TokenResource(baseWebResource);
    }

    /**
     * This resource returns information about player accounts. This endpoint is
     * only accessible with a valid API key.
     *
     * @return
     *
     * @see <a href="https://wiki.guildwars2.com/wiki/API:2/account">Guild Wars
     * 2 Wiki</a>
     */
    public AccountResource account() {
        return accountResource;
    }

    /**
     * This resource returns the current build id of the game. This can be used,
     * for example, to register when event timers reset due to server restarts.
     *
     * @return
     *
     * @see <a href="https://wiki.guildwars2.com/wiki/API:2/build">Guild Wars 2
     * Wiki</a>
     */
    public ColorsResource build() {
        return buildResource;
    }

    /**
     * This resource returns information about characters attached to a specific
     * account.
     *
     * @return
     *
     * @see <a href="https://wiki.guildwars2.com/wiki/API:2/characters">Guild
     * Wars 2 Wiki</a>
     */
    public CharactersResource characters() {
        return charactersResource;
    }

    /**
     * This resource returns information about prices, listings, exchange rates
     * and transactions.
     *
     * @return
     */
    public CommerceResource commerce() {
        return commerceResource;
    }

    /**
     * This resource returns all dye colors in the game, including localized
     * names and their color component information.
     *
     * @return
     *
     * @see <a href="https://wiki.guildwars2.com/wiki/API:2/colors">Guild Wars 2
     * Wiki</a>
     */
    public ColorsResource colors() {
        return colorResource;
    }

    /**
     * This resource returns a list of the currencies contained in the account wallet. 
     * 
     * @return 
     * 
     * @see <a href="https://wiki.guildwars2.com/wiki/API:2/currencies">Guild Wars 2
     * Wiki</a>
     */
    public CurrenciesResource currencies() {
        return currenciesResource;
    }
    
    /**
     * This resource returns information about the supplied API key.
     *
     * @return
     *
     * @see <a href="https://wiki.guildwars2.com/wiki/API:2/tokeninfo">Guild
     * Wars 2 Wiki</a>
     */
    public TokenResource tokeninfo() {
        return tokenResource;
    }

    /**
     * {@link Client#destroy()}
     *
     * @see Client#destroy()
     */
    public void destroy() {
        client.destroy();
    }
}
