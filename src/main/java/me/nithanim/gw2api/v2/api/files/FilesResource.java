package me.nithanim.gw2api.v2.api.files;

import me.nithanim.gw2api.v2.ApiEndpoint;

/**
 * This resource returns commonly requested in-game assets that may be used to
 * enhance API-derived applications.
 *
 * @see
 * <a href="https://wiki.guildwars2.com/wiki/API:2/files">GW2Wiki</a>
 */
public interface FilesResource extends ApiEndpoint {
    String[] getOverview();
    
    File get(String id);

    File[] get(String[] ids);

    File[] getAll();
}
