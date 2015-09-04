package me.nithanim.gw2api.v2.api.skins;

import com.sun.jersey.api.client.WebResource;
import me.nithanim.gw2api.v2.util.rest.IdsResourceBase;

/**
 * This resource returns information about skins that were discovered by players in the game. 
 *
 * @see
 * <a href="https://wiki.guildwars2.com/wiki/API:2/skins">GW2Wiki</a>
 */
public class SkinsResourceImpl extends IdsResourceBase<Skin, int[]> implements SkinsResource {
    public SkinsResourceImpl(WebResource webResource) {
        super(webResource, "skins", Skin.class, int[].class);
    }
}
