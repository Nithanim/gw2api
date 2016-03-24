package me.nithanim.gw2api.v2.configs;

import com.sun.jersey.api.client.config.ClientConfig;
import me.nithanim.gw2api.v2.GuildWars2Api;

/**
 * This is the basic interface for the configuration of the
 * {@link GuildWars2Api}. Do not implement this interface directly as it might
 * change in the future. Please extend the {@link GuildWars2ApiDefaultConfig}
 * and overwrite the methods there instead.
 */
public interface GuildWars2ApiConfig {
    String getBaseUrl();

    public ClientConfig getClientConfig();
}
