package me.nithanim.gw2api.v2.util.rest;

import com.sun.jersey.api.client.WebResource;
import java.io.IOException;
import java.lang.reflect.Type;
import me.nithanim.gw2api.v2.GuildWars2Api;
import me.nithanim.gw2api.v2.ResourceHelper;

/**
 * This is a implementation of {@link RequestHelper} that fetches the data from
 * the file system rather than querying the api.
 */
public class TestRequestHelper implements RequestHelper {
    @Override
    public <T> T getRequest(WebResource wr, Type type) {
        try {
            String path = rewritePath(wr);
            String json = ResourceHelper.inputStreamToString(ClassLoader.class.getResourceAsStream(path));
            return GuildWars2Api.GSON.fromJson(json, type);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public <T> T getRequest(WebResource wr, String apiKey, Class<T> clazz) {
        return getRequest(wr, clazz);
    }

    @Override
    public <T> PaginationResult<T> getRequestExtended(WebResource wr, String apiKey, Class<T> clazz) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <T> T getRequest(WebResource wr, Class<T> clazz, String arg0Name, String arg0Value) {
        return getRequest(wr, clazz);
    }

    @Override
    public <T> T getRequest(WebResource wr, String apiKey, Class<T> clazz, String arg0Name, String arg0Value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <T> PaginationResult<T> getRequestExtended(WebResource wr, String apiKey, Class<T> clazz, String arg0Name, String arg0Value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <T> T getRequest(WebResource wr, Class<T> clazz, String arg0Name, String arg0Value, String arg1Name, String arg1Value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <T> PaginationResult<T> getRequestExtended(WebResource wr, String apiKey, Class<T> clazz, String arg0Name, String arg0Value, String arg1Name, String arg1Value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private String rewritePath(WebResource wr) {
        String path = wr.getURI().getPath();
        int i = path.indexOf('/', 1);
        return "/v2/raw" + path.substring(i) + ".json";
    }
}
