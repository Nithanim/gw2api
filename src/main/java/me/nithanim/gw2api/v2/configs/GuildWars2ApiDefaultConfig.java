package me.nithanim.gw2api.v2.configs;

import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class GuildWars2ApiDefaultConfig implements GuildWars2ApiConfig {
    @Override
    public String getBaseUrl() {
        return "https://api.guildwars2.com/v2/";
    }

    @Override
    public ClientConfig getClientConfig() {
        return new DefaultClientConfig();
    }
}
