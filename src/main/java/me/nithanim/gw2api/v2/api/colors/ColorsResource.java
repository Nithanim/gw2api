package me.nithanim.gw2api.v2.api.colors;

import java.util.List;

import me.nithanim.gw2api.v2.ApiEndpoint;
import me.nithanim.gw2api.v2.Language;

/**
 * This resource returns all <a href="https://wiki.guildwars2.com/wiki/Dye">dye</a> colors in the
 * game, including localized names and their color component information.
 *
 * @see <a href="https://wiki.guildwars2.com/wiki/API:2/colors">Guild Wars 2 Wiki</a>
 */
public interface ColorsResource extends ApiEndpoint {
  int[] getOverview();

  Color get(int id);

  Color get(int id, Language lang);

  List<Color> get(int[] ids);

  List<Color> get(int[] ids, Language lang);

  List<Color> getAll();

  List<Color> getAll(Language lang);
}
