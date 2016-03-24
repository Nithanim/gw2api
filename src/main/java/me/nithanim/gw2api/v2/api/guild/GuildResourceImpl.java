package me.nithanim.gw2api.v2.api.guild;

import com.sun.jersey.api.client.WebResource;
import me.nithanim.gw2api.v2.ApiMidpoint;
import me.nithanim.gw2api.v2.api.guild.upgrades.GuildUpgradesResource;
import me.nithanim.gw2api.v2.api.guild.upgrades.GuildUpgradesResourceImpl;

public class GuildResourceImpl implements GuildResource, ApiMidpoint {
    private final GuildUpgradesResource upgradesResource;

    public GuildResourceImpl(WebResource webResource) {
        WebResource guildWebResource = webResource.path("guild");
        upgradesResource = new GuildUpgradesResourceImpl(guildWebResource);
    }

    @Override
    public GuildUpgradesResource upgrades() {
        return upgradesResource;
    }
}
