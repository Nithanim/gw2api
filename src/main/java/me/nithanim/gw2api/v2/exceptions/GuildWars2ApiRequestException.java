package me.nithanim.gw2api.v2.exceptions;

import me.nithanim.gw2api.v2.GuildWars2ApiException;

/** An exception that wrapps the json error response from the api. */
public class GuildWars2ApiRequestException extends GuildWars2ApiException {
  private static final long serialVersionUID = 1L;

  public GuildWars2ApiRequestException(String message) {
    super(message);
  }
}
