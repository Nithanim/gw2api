package me.nithanim.gw2api.v2.api.files;

import java.util.List;

import me.nithanim.gw2api.v2.ApiEndpoint;

/**
 * This resource returns commonly requested in-game assets that may be used to enhance API-derived
 * applications.
 *
 * @see <a href="https://wiki.guildwars2.com/wiki/API:2/files">GW2Wiki</a>
 */
public interface FilesResource extends ApiEndpoint {
  List<String> getOverview();

  File get(String id);

  List<File> get(List<String> ids);

  List<File> getAll();
}
