package me.nithanim.gw2api.v2.api.skins;

import java.util.List;

import me.nithanim.gw2api.v2.ApiEndpoint;

/**
 * This resource returns information about skins that were discovered by players in the game.
 *
 * @see <a href="https://wiki.guildwars2.com/wiki/API:2/skins">GW2Wiki</a>
 */
public interface SkinsResource extends ApiEndpoint {
  int[] getOverview();

  Skin get(int id);

  Skin get(int id, String lang);

  List<Skin> get(int[] ids);

  List<Skin> get(int[] ids, String lang);
}
