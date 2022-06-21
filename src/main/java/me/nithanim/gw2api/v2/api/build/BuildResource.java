package me.nithanim.gw2api.v2.api.build;

import me.nithanim.gw2api.v2.ApiEndpoint;

/**
 * This resource returns the current build id of the game. This can be used, for example, to
 * register when event timers reset due to server restarts.
 *
 * @see <a
 *     href="https://wiki.guildwars2.com/wiki/API:2/build">https://wiki.guildwars2.com/wiki/API:2/build</a>
 */
public interface BuildResource extends ApiEndpoint {
  /**
   * The response is an object with the single property id containing the current build id as a
   * number.
   *
   * @return the current build number
   */
  Build get();
}
