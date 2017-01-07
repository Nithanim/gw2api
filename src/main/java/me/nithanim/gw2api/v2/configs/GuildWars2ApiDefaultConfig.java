package me.nithanim.gw2api.v2.configs;

import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Setter
@Accessors(chain = true, fluent = true)
public class GuildWars2ApiDefaultConfig implements GuildWars2ApiConfig {
    private ClientConfig jerseyClientConfig = new DefaultClientConfig();
    private String baseUrl = "https://api.guildwars2.com/v2/";
    private boolean goDaddyFix = true;

    @Override
    public String getBaseUrl() {
        return baseUrl;
    }

    @Override
    public ClientConfig getClientConfig() {
        return jerseyClientConfig;
    }

    @Override
    public boolean isGoDaddyFixEnabled() {
        return goDaddyFix;
    }
}
