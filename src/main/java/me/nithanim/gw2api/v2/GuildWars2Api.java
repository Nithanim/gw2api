package me.nithanim.gw2api.v2;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import java.util.EnumMap;
import me.nithanim.gw2api.v2.api.account.AccountResource;
import me.nithanim.gw2api.v2.api.achievements.AchievementResource;
import me.nithanim.gw2api.v2.api.achievements.AchievementResourceImpl;
import me.nithanim.gw2api.v2.api.achievements.DailyAchievement;
import me.nithanim.gw2api.v2.api.build.BuildResource;
import me.nithanim.gw2api.v2.api.characters.CharactersResource;
import me.nithanim.gw2api.v2.api.colors.ColorsResource;
import me.nithanim.gw2api.v2.api.colors.ColorsResourceImpl;
import me.nithanim.gw2api.v2.api.commerce.CommerceResource;
import me.nithanim.gw2api.v2.api.continents.ContinentsResource;
import me.nithanim.gw2api.v2.api.continents.ContinentsResourceImpl;
import me.nithanim.gw2api.v2.api.currencies.CurrenciesResource;
import me.nithanim.gw2api.v2.api.currencies.CurrenciesResourceImpl;
import me.nithanim.gw2api.v2.api.files.FilesResource;
import me.nithanim.gw2api.v2.api.files.FilesResourceImpl;
import me.nithanim.gw2api.v2.api.guild.GuildResource;
import me.nithanim.gw2api.v2.api.guild.GuildResourceImpl;
import me.nithanim.gw2api.v2.api.items.ItemInfo;
import me.nithanim.gw2api.v2.api.items.ItemsResource;
import me.nithanim.gw2api.v2.api.items.ItemsResourceImpl;
import me.nithanim.gw2api.v2.api.maps.MapsResource;
import me.nithanim.gw2api.v2.api.maps.MapsResourceImpl;
import me.nithanim.gw2api.v2.api.pvp.PvpResource;
import me.nithanim.gw2api.v2.api.recipes.RecipesResource;
import me.nithanim.gw2api.v2.api.recipes.RecipesResourceImpl;
import me.nithanim.gw2api.v2.api.skins.SkinsResource;
import me.nithanim.gw2api.v2.api.skins.SkinsResourceImpl;
import me.nithanim.gw2api.v2.api.specializations.SpecializationsResource;
import me.nithanim.gw2api.v2.api.specializations.SpecializationsResourceImpl;
import me.nithanim.gw2api.v2.api.tokeninfo.TokenResource;
import me.nithanim.gw2api.v2.api.traits.Fact;
import me.nithanim.gw2api.v2.api.traits.TraitedFact;
import me.nithanim.gw2api.v2.api.traits.TraitsResource;
import me.nithanim.gw2api.v2.api.traits.TraitsResourceImpl;
import me.nithanim.gw2api.v2.api.worlds.WorldsResource;
import me.nithanim.gw2api.v2.api.worlds.WorldsResourceImpl;
import me.nithanim.gw2api.v2.configs.GuildWars2ApiConfig;
import me.nithanim.gw2api.v2.configs.GuildWars2ApiDefaultConfig;
import me.nithanim.gw2api.v2.util.gson.EnumMapInstanceCreator;
import me.nithanim.gw2api.v2.util.gson.EnumTypeAdapterFactory;
import me.nithanim.gw2api.v2.util.gson.achievements.DailyAchievementsJsonDeserializer;
import me.nithanim.gw2api.v2.util.gson.facts.FactJsonDeserializer;
import me.nithanim.gw2api.v2.util.gson.facts.TraitedFactJsonDeserializer;
import me.nithanim.gw2api.v2.util.gson.items.ItemInfoJsonDeserializer;
import me.nithanim.gw2api.v2.util.time.DateTimeAdapter;

public class GuildWars2Api {
    public static final Gson GSON = new GsonBuilder()
        .registerTypeAdapter(DateTimeAdapter.TYPE, new DateTimeAdapter())
        .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
        .registerTypeAdapterFactory(new EnumTypeAdapterFactory())
        .registerTypeAdapter(
            new TypeToken<EnumMap>() {
            }.getType(),
            new EnumMapInstanceCreator<>()
        )
        .registerTypeAdapter(Fact.class, new FactJsonDeserializer())
        .registerTypeAdapter(TraitedFact.class, new TraitedFactJsonDeserializer())
        .registerTypeAdapter(ItemInfo.class, new ItemInfoJsonDeserializer())
        .registerTypeAdapter(DailyAchievement.class, new DailyAchievementsJsonDeserializer())
        .create();

    private final Client client;
    private final AccountResource accountResource;
    private final AchievementResource achievements;
    private final BuildResource buildResource;
    private final CommerceResource commerceResource;
    private final CharactersResource charactersResource;
    private final ColorsResource colorResource;
    private final ContinentsResource continentsResource;
    private final CurrenciesResource currenciesResource;
    private final FilesResource filesResource;
    private final GuildResource guildResource;
    private final ItemsResource itemsResource;
    private final MapsResource mapsResource;
    private final PvpResource pvpResource;
    private final RecipesResource recipesResource;
    private final SkinsResource skinsResource;
    private final SpecializationsResource specializationsResource;
    private final TokenResource tokenResource;
    private final TraitsResource traitsResource;
    private final WorldsResource worldsResource;

    public GuildWars2Api() {
        this(new GuildWars2ApiDefaultConfig());
    }

    public GuildWars2Api(GuildWars2ApiConfig config) {
        client = Client.create(config.getClientConfig());
        WebResource baseWebResource = client.resource(config.getBaseUrl());

        accountResource = new AccountResource(baseWebResource);
        achievements = new AchievementResourceImpl(baseWebResource);
        buildResource = new BuildResource(baseWebResource);
        commerceResource = new CommerceResource(baseWebResource);
        charactersResource = new CharactersResource(baseWebResource);
        colorResource = new ColorsResourceImpl(baseWebResource);
        continentsResource = new ContinentsResourceImpl(baseWebResource);
        currenciesResource = new CurrenciesResourceImpl(baseWebResource);
        filesResource = new FilesResourceImpl(baseWebResource);
        guildResource = new GuildResourceImpl(baseWebResource);
        itemsResource = new ItemsResourceImpl(baseWebResource);
        mapsResource = new MapsResourceImpl(baseWebResource);
        pvpResource = new PvpResource(baseWebResource);
        recipesResource = new RecipesResourceImpl(baseWebResource);
        skinsResource = new SkinsResourceImpl(baseWebResource);
        specializationsResource = new SpecializationsResourceImpl(baseWebResource);
        tokenResource = new TokenResource(baseWebResource);
        traitsResource = new TraitsResourceImpl(baseWebResource);
        worldsResource = new WorldsResourceImpl(baseWebResource);
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
     * This resource returns information about achievements. This endpoint is
     * only accessible with a valid API key.
     *
     * @return
     *
     * @see <a href="https://wiki.guildwars2.com/wiki/API:2/achievements">Guild
     * Wars 2 Wiki</a>
     */
    public AchievementResource achievements() {
        return achievements;
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
    public BuildResource build() {
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
     * This resource returns static information about the continents, floors,
     * regions, maps, sectors, points of interest and tasks.
     *
     * @return
     *
     * @see <a href="https://wiki.guildwars2.com/wiki/API:2/continents">Guild
     * Wars 2 Wiki</a>
     */
    public ContinentsResource continents() {
        return continentsResource;
    }

    /*public FloorsResource continents(int continentId) {
     return new FloorsResourceImpl(continentsResource, continentId);
     }*/
    /**
     * This resource returns a list of the currencies contained in the account
     * wallet.
     *
     * @return
     *
     * @see <a href="https://wiki.guildwars2.com/wiki/API:2/currencies">Guild
     * Wars 2 Wiki</a>
     */
    public CurrenciesResource currencies() {
        return currenciesResource;
    }

    /**
     * This resource returns commonly requested in-game assets that may be used
     * to enhance API-derived applications.
     *
     * @return
     *
     * @see
     * <a href="https://wiki.guildwars2.com/wiki/API:2/files">GW2Wiki</a>
     */
    public FilesResource files() {
        return filesResource;
    }

    /**
     * This resource returns information about all available <a
     * href="https://wiki.guildwars2.com/wiki/Guild_Hall">Guild Hall</a>
     * upgrades, including scribe decorations.
     *
     * @return
     *
     * @see
     * <a href="https://wiki.guildwars2.com/wiki/API:2">GW2Wiki</a>
     */
    public GuildResource guild() {
        return guildResource;
    }

    /**
     * This resource returns information about items that were discovered by
     * players in the game.
     *
     * @return
     *
     * @see
     * <a href="https://wiki.guildwars2.com/wiki/API:2/items">GW2Wiki</a>
     */
    public ItemsResource items() {
        return itemsResource;
    }

    /**
     * This resource returns details about maps in the game, including details
     * about floor and translation data on how to translate between world
     * coordinates and map coordinates.
     *
     * @return
     *
     * @see
     * <a href="https://wiki.guildwars2.com/wiki/API:2/maps">GW2Wiki</a>
     */
    public MapsResource maps() {
        return mapsResource;
    }

    public PvpResource pvp() {
        return pvpResource;
    }

    /**
     * This resource returns information about recipes that were discovered by
     * players in the game.
     *
     * @return
     */
    public RecipesResource recipes() {
        return recipesResource;
    }

    /**
     * This resource returns information about skins that were discovered by
     * players in the game.
     *
     * @return
     */
    public SkinsResource skins() {
        return skinsResource;
    }

    /**
     * This resource returns information about the specializations.
     *
     * @return
     *
     * @see <a href="http://wiki.guildwars2.com/wiki/API:2/specializations">
     * Guild Wars 2 Wiki</a>
     */
    public SpecializationsResource specializations() {
        return specializationsResource;
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
     * This resource returns information about specific traits which are
     * contained within specializations.
     *
     * @return
     */
    public TraitsResource traits() {
        return traitsResource;
    }

    /**
     * This resource returns information about the available worlds, or servers.
     *
     * @return
     */
    public WorldsResource worlds() {
        return worldsResource;
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
