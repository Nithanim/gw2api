package me.nithanim.gw2api.v2.configs;

import com.sun.jersey.api.client.config.ClientConfig;

/**
 * This configuartion is a workaround for the fact that ArenaNet switched their
 * certificate autority to godaddy.
 *
 * {@link GoDaddyFix}
 *
 * @deprecated Use {@link GuildWars2ApiDefaultConfig} instead and set
 * {@link GuildWars2ApiDefaultConfig#goDaddyFix(boolean)} too true
 */
@Deprecated
public class GuildWars2ApiDefaultConfigWithGodaddyFix extends GuildWars2ApiDefaultConfig {
    @Override
    public ClientConfig getClientConfig() {
        ClientConfig cc = super.getClientConfig();
        GoDaddyFix.insertFix(cc);
        return cc;
    }
}
