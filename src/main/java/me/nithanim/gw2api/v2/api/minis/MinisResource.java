package me.nithanim.gw2api.v2.api.minis;

import java.util.List;

import me.nithanim.gw2api.v2.ApiEndpoint;

/**
 * This resource returns information about minis that were discovered by players in the game.
 *
 * @see <a href="https://wiki.guildwars2.com/wiki/API:2/minis">GW2Wiki</a>
 */
public interface MinisResource extends ApiEndpoint {
  int[] getOverview();

  Mini get(int id);

  Mini get(int id, String lang);

  List<Mini> get(int[] ids);

  List<Mini> get(int[] ids, String lang);

  List<Mini> getAll();

  List<Mini> getAll(String lang);
}
