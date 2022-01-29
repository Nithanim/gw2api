package me.nithanim.gw2api.v2.api.skins;

import javax.ws.rs.client.WebTarget;

import me.nithanim.gw2api.v2.util.rest.IdsResourceBase;

/**
 * This resource returns information about skins that were discovered by players in the game.
 *
 * @see <a href="https://wiki.guildwars2.com/wiki/API:2/skins">GW2Wiki</a>
 */
public class SkinsResourceImpl extends IdsResourceBase<Skin, int[]> implements SkinsResource {
  public SkinsResourceImpl(WebTarget webTarget) {
    super(webTarget.path("skins"), Skin.class, int[].class);
  }
}
