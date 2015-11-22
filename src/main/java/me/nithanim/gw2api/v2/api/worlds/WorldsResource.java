package me.nithanim.gw2api.v2.api.worlds;

import me.nithanim.gw2api.v2.ApiEndpoint;
import me.nithanim.gw2api.v2.common.Language;

/**
 * This resource returns information about the available worlds, or servers.
 */
public interface WorldsResource extends ApiEndpoint {
    /**
     * A list with all possible ids.
     *
     * @return
     */
    int[] getOverview();

    World get(int id);

    World[] get(int[] ids);

    World get(int id, Language lang);

    World[] get(int[] ids, Language lang);
}
