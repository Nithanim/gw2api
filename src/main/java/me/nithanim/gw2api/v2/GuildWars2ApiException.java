package me.nithanim.gw2api.v2;

public class GuildWars2ApiException extends RuntimeException {
    public GuildWars2ApiException(String message) {
        super(message);
    }

    public GuildWars2ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public GuildWars2ApiException(Throwable cause) {
        super(cause);
    }
}
