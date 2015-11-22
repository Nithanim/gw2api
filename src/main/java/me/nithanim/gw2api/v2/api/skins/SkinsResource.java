package me.nithanim.gw2api.v2.api.skins;

import me.nithanim.gw2api.v2.ApiEndpoint;
import me.nithanim.gw2api.v2.common.Language;

/**
 * This resource returns information about skins that were discovered by players
 * in the game.
 */
public interface SkinsResource extends ApiEndpoint {
    int[] getOverview();

    Skin get(int id);

    Skin get(int id, Language lang);

    Skin[] get(int[] ids);

    Skin[] get(int[] ids, Language lang);
}
