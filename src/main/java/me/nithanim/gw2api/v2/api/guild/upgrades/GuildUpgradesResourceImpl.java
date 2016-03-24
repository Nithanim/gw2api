package me.nithanim.gw2api.v2.api.guild.upgrades;

import com.sun.jersey.api.client.WebResource;
import me.nithanim.gw2api.v2.util.rest.IdsResourceBase;

public class GuildUpgradesResourceImpl extends IdsResourceBase<GuildUpgrade, int[]> implements GuildUpgradesResource {

    public GuildUpgradesResourceImpl(WebResource webResource) {
        super(webResource.path("upgrades"), GuildUpgrade.class, int[].class);
    }

}
