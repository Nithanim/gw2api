package me.nithanim.gw2api.v2.api.colors;

import com.sun.jersey.api.client.WebResource;
import me.nithanim.gw2api.v2.ApiEndpoint;
import me.nithanim.gw2api.v2.util.rest.IdsResourceBase;

/**
 * This resource returns all
 * <a href="https://wiki.guildwars2.com/wiki/Dye">dye</a> colors in the game,
 * including localized names and their color component information.
 *
 * @see
 * <a href="https://wiki.guildwars2.com/wiki/API:2/colors">Guild Wars 2 Wiki</a>
 */
public class ColorsResourceImpl extends IdsResourceBase<Color, int[]> implements ColorsResource {
    public ColorsResourceImpl(WebResource webResource) {
        super(webResource.path("colors"), Color.class, int[].class);
    }
}
