package me.nithanim.gw2api.v2;

import java.util.EnumMap;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

import org.glassfish.jersey.apache.connector.ApacheConnectorProvider;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.JerseyClient;
import org.glassfish.jersey.client.JerseyClientBuilder;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

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
import me.nithanim.gw2api.v2.configs.GoDaddyFix;
import me.nithanim.gw2api.v2.configs.GuildWars2ApiConfig;
import me.nithanim.gw2api.v2.configs.GuildWars2ApiDefaultConfig;
import me.nithanim.gw2api.v2.util.gson.EnumMapInstanceCreator;
import me.nithanim.gw2api.v2.util.gson.EnumTypeAdapterFactory;
import me.nithanim.gw2api.v2.util.gson.IntObjMapTypeAdapterFactory;
import me.nithanim.gw2api.v2.util.gson.achievements.DailyAchievementsJsonDeserializer;
import me.nithanim.gw2api.v2.util.gson.facts.FactJsonDeserializer;
import me.nithanim.gw2api.v2.util.gson.facts.TraitedFactJsonDeserializer;
import me.nithanim.gw2api.v2.util.gson.items.ItemInfoJsonDeserializer;
import me.nithanim.gw2api.v2.util.time.DateTimeAdapter;

public class GuildWars2Api {
  public static final Gson GSON =
      new GsonBuilder()
          .registerTypeAdapter(DateTimeAdapter.TYPE, new DateTimeAdapter())
          .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
          .registerTypeAdapterFactory(new EnumTypeAdapterFactory())
          .registerTypeAdapter(
              new TypeToken<EnumMap>() {}.getType(), new EnumMapInstanceCreator<>())
          .registerTypeAdapterFactory(new IntObjMapTypeAdapterFactory())
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
    this(buildClient(config), config);
  }

  private GuildWars2Api(Client client, GuildWars2ApiConfig config) {
    this(client, client.target(config.getBaseUrl()));
  }

  /**
   * Intended for testing only
   *
   * @param client
   * @param baseResource
   */
  @Deprecated
  public GuildWars2Api(Client client, WebTarget baseResource) {
    this.client = client;
    accountResource = new AccountResource(baseResource);
    achievements = new AchievementResourceImpl(baseResource);
    buildResource = new BuildResource(baseResource);
    commerceResource = new CommerceResource(baseResource);
    charactersResource = new CharactersResource(baseResource);
    colorResource = new ColorsResourceImpl(baseResource);
    continentsResource = new ContinentsResourceImpl(baseResource);
    currenciesResource = new CurrenciesResourceImpl(baseResource);
    filesResource = new FilesResourceImpl(baseResource);
    guildResource = new GuildResourceImpl(baseResource);
    itemsResource = new ItemsResourceImpl(baseResource);
    mapsResource = new MapsResourceImpl(baseResource);
    pvpResource = new PvpResource(baseResource);
    recipesResource = new RecipesResourceImpl(baseResource);
    skinsResource = new SkinsResourceImpl(baseResource);
    specializationsResource = new SpecializationsResourceImpl(baseResource);
    tokenResource = new TokenResource(baseResource);
    traitsResource = new TraitsResourceImpl(baseResource);
    worldsResource = new WorldsResourceImpl(baseResource);
  }

  private static JerseyClient buildClient(GuildWars2ApiConfig config) {
    ClientConfig jerseyConfig = config.getClientConfig();
    JerseyClientBuilder builder = new JerseyClientBuilder().withConfig(jerseyConfig);
    if (config.isGoDaddyFixEnabled()) {
      GoDaddyFix.insertFix(builder);
    }

    if (config.isApacheHttpClientEnabled()) {
      jerseyConfig.connectorProvider(new ApacheConnectorProvider());
    }
    return builder.build();
  }

  /**
   * This resource returns information about player accounts. This endpoint is only accessible with
   * a valid API key.
   *
   * @return a resource that enables fetching account details
   * @see <a href="https://wiki.guildwars2.com/wiki/API:2/account">Guild Wars 2 Wiki</a>
   */
  public AccountResource account() {
    return accountResource;
  }

  /**
   * This resource returns information about achievements. This endpoint is only accessible with a
   * valid API key.
   *
   * @return a resource that enables fetching achievement details
   * @see <a href="https://wiki.guildwars2.com/wiki/API:2/achievements">Guild Wars 2 Wiki</a>
   */
  public AchievementResource achievements() {
    return achievements;
  }

  /**
   * This resource returns the current build id of the game. This can be used, for example, to
   * register when event timers reset due to server restarts.
   *
   * @return a resource that enables fetching game-build details
   * @see <a href="https://wiki.guildwars2.com/wiki/API:2/build">Guild Wars 2 Wiki</a>
   */
  public BuildResource build() {
    return buildResource;
  }

  /**
   * This resource returns information about characters attached to a specific account.
   *
   * @return a resource that enables fetching character details
   * @see <a href="https://wiki.guildwars2.com/wiki/API:2/characters">Guild Wars 2 Wiki</a>
   */
  public CharactersResource characters() {
    return charactersResource;
  }

  /**
   * This resource returns information about prices, listings, exchange rates and transactions.
   *
   * @return a resource that enables fetching trading post details
   */
  public CommerceResource commerce() {
    return commerceResource;
  }

  /**
   * This resource returns all dye colors in the game, including localized names and their color
   * component information.
   *
   * @return a resource that enables fetching color details
   * @see <a href="https://wiki.guildwars2.com/wiki/API:2/colors">Guild Wars 2 Wiki</a>
   */
  public ColorsResource colors() {
    return colorResource;
  }

  /**
   * This resource returns static information about the continents, floors, regions, maps, sectors,
   * points of interest and tasks.
   *
   * @return a resource that enables fetching continent details
   * @see <a href="https://wiki.guildwars2.com/wiki/API:2/continents">Guild Wars 2 Wiki</a>
   */
  public ContinentsResource continents() {
    return continentsResource;
  }

  /**
   * This resource returns a list of the currencies contained in the account wallet.
   *
   * @return a resource that enables fetching currency details
   * @see <a href="https://wiki.guildwars2.com/wiki/API:2/currencies">Guild Wars 2 Wiki</a>
   */
  public CurrenciesResource currencies() {
    return currenciesResource;
  }

  /**
   * This resource returns commonly requested in-game assets that may be used to enhance API-derived
   * applications.
   *
   * @return a resource that enables fetching file details
   * @see <a href="https://wiki.guildwars2.com/wiki/API:2/files">GW2Wiki</a>
   */
  public FilesResource files() {
    return filesResource;
  }

  /**
   * This resource returns information about all available <a
   * href="https://wiki.guildwars2.com/wiki/Guild_Hall">Guild Hall</a> upgrades, including scribe
   * decorations.
   *
   * @return a resource that enables fetching guild details
   * @see <a href="https://wiki.guildwars2.com/wiki/API:2">GW2Wiki</a>
   */
  public GuildResource guild() {
    return guildResource;
  }

  /**
   * This resource returns information about items that were discovered by players in the game.
   *
   * @return a resource that enables fetching item details
   * @see <a href="https://wiki.guildwars2.com/wiki/API:2/items">GW2Wiki</a>
   */
  public ItemsResource items() {
    return itemsResource;
  }

  /**
   * This resource returns details about maps in the game, including details about floor and
   * translation data on how to translate between world coordinates and map coordinates.
   *
   * @return a resource that enables fetching map details
   * @see <a href="https://wiki.guildwars2.com/wiki/API:2/maps">GW2Wiki</a>
   */
  public MapsResource maps() {
    return mapsResource;
  }

  public PvpResource pvp() {
    return pvpResource;
  }

  /**
   * This resource returns information about recipes that were discovered by players in the game.
   *
   * @return a resource that enables fetching recipe details
   */
  public RecipesResource recipes() {
    return recipesResource;
  }

  /**
   * This resource returns information about skins that were discovered by players in the game.
   *
   * @return a resource that enables fetching skin details
   */
  public SkinsResource skins() {
    return skinsResource;
  }

  /**
   * This resource returns information about the specializations.
   *
   * @return a resource that enables fetching specialization details
   * @see <a href="http://wiki.guildwars2.com/wiki/API:2/specializations">Guild Wars 2 Wiki</a>
   */
  public SpecializationsResource specializations() {
    return specializationsResource;
  }

  /**
   * This resource returns information about the supplied API key.
   *
   * @return a resource that enables fetching details about an access token
   * @see <a href="https://wiki.guildwars2.com/wiki/API:2/tokeninfo">Guild Wars 2 Wiki</a>
   */
  public TokenResource tokeninfo() {
    return tokenResource;
  }

  /**
   * This resource returns information about specific traits which are contained within
   * specializations.
   *
   * @return a resource that enables fetching trait details
   */
  public TraitsResource traits() {
    return traitsResource;
  }

  /**
   * This resource returns information about the available worlds, or servers.
   *
   * @return a resource that enables fetching world details
   */
  public WorldsResource worlds() {
    return worldsResource;
  }

  /** Releases all resources. */
  public void destroy() {
    client.close();
  }
}
