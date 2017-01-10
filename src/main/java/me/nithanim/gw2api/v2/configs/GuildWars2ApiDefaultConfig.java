package me.nithanim.gw2api.v2.configs;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.glassfish.jersey.client.ClientConfig;

@NoArgsConstructor
@Setter
@Accessors(chain = true, fluent = true)
public class GuildWars2ApiDefaultConfig implements GuildWars2ApiConfig {
    private ClientConfig jerseyClientConfig = new ClientConfig();
    private String baseUrl = "https://api.guildwars2.com/v2/";
    private boolean useGoDaddyFix = true;
    private boolean useApacheHttpClient = false;

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
        return useGoDaddyFix;
    }

    @Override
    public boolean isApacheHttpClientEnabled() {
        return useApacheHttpClient;
    }
}
