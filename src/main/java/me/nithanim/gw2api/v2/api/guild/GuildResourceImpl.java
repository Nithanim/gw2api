package me.nithanim.gw2api.v2.api.guild;

import javax.ws.rs.client.WebTarget;
import me.nithanim.gw2api.v2.ApiMidpoint;
import me.nithanim.gw2api.v2.api.guild.upgrades.GuildUpgradesResource;
import me.nithanim.gw2api.v2.api.guild.upgrades.GuildUpgradesResourceImpl;

public class GuildResourceImpl implements GuildResource, ApiMidpoint {
    private final GuildUpgradesResource upgradesResource;

    public GuildResourceImpl(WebTarget webTarget) {
        WebTarget guildWebTarget = webTarget.path("guild");
        upgradesResource = new GuildUpgradesResourceImpl(guildWebTarget);
    }

    @Override
    public GuildUpgradesResource upgrades() {
        return upgradesResource;
    }
}
