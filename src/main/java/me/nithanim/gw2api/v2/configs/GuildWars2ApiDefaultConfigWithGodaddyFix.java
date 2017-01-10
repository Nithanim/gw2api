package me.nithanim.gw2api.v2.configs;

/**
 * This configuartion is a workaround for the fact that ArenaNet switched their
 * certificate autority to godaddy.
 *
 * {@link GoDaddyFix}
 *
 * @deprecated Use {@link GuildWars2ApiDefaultConfig} instead and set
 * {@link GuildWars2ApiDefaultConfig#useGoDaddyFix(boolean) } to true
 */
@Deprecated
public class GuildWars2ApiDefaultConfigWithGodaddyFix extends GuildWars2ApiDefaultConfig {
    @Override
    public boolean isGoDaddyFixEnabled() {
        return true;
    }
}
