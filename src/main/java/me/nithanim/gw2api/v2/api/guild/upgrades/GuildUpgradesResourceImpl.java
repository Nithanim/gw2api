package me.nithanim.gw2api.v2.api.guild.upgrades;

import javax.ws.rs.client.WebTarget;
import me.nithanim.gw2api.v2.util.rest.IdsResourceBase;

public class GuildUpgradesResourceImpl extends IdsResourceBase<GuildUpgrade, int[]> implements GuildUpgradesResource {

    public GuildUpgradesResourceImpl(WebTarget webTarget) {
        super(webTarget.path("upgrades"), GuildUpgrade.class, int[].class);
    }

}
