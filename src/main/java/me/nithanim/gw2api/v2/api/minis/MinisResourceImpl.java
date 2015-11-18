package me.nithanim.gw2api.v2.api.minis;

import com.sun.jersey.api.client.WebResource;
import me.nithanim.gw2api.v2.util.rest.IdsResourceBase;

/**
 * This resource returns information about minis that were discovered by players in the game.
 *
 * @see
 * <a href="https://wiki.guildwars2.com/wiki/API:2/minis">GW2Wiki</a>
 */
public class MinisResourceImpl extends IdsResourceBase<Mini, int[]> implements MinisResource {
    public MinisResourceImpl(WebResource webResource) {
        super(webResource.path("minis"), Mini.class, int[].class);
    }
}
