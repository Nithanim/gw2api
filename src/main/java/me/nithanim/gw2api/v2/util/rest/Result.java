package me.nithanim.gw2api.v2.util.rest;

public interface Result<T> {
    /**
     * The actual result that is sent by the server.
     *
     * @return the result
     */
    T getResult();
}
