package me.nithanim.gw2api.v2.exceptions;

import me.nithanim.gw2api.v2.GuildWars2ApiException;

/**
 * An exception indicating problems communicating with the server.
 */
public class GuildWars2ApiIOException extends GuildWars2ApiException {
    private static final long serialVersionUID = 1L;

    public GuildWars2ApiIOException(String message, Throwable cause) {
        super(message, cause);
    }
}
