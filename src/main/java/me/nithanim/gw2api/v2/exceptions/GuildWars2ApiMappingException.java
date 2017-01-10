package me.nithanim.gw2api.v2.exceptions;

import me.nithanim.gw2api.v2.GuildWars2ApiException;

/**
 * An exception indicating problems translating json to java objects.
 */
public class GuildWars2ApiMappingException extends GuildWars2ApiException {
    private static final long serialVersionUID = 1L;
    
    public GuildWars2ApiMappingException(String message, Throwable cause) {
        super(message, cause);
    }
}
