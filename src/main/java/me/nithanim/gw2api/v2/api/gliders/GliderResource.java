package me.nithanim.gw2api.v2.api.gliders;

import java.util.List;

import me.nithanim.gw2api.v2.ApiEndpoint;
import me.nithanim.gw2api.v2.Language;

/**
 * This resource returns information about gliders that are available in-game.
 *
 * @see <a href="https://wiki.guildwars2.com/wiki/API:2/gliders">GW2Wiki</a>
 */
public interface GliderResource extends ApiEndpoint {
  int[] getOverview();

  Glider get(int id);

  Glider get(int id, Language lang);

  List<Glider> get(int[] ids);

  List<Glider> get(int[] ids, Language lang);

  List<Glider> getAll();

  List<Glider> getAll(Language lang);
}
