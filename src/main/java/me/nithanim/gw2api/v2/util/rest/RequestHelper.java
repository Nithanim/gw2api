package me.nithanim.gw2api.v2.util.rest;

import com.sun.jersey.api.client.WebResource;
import java.lang.reflect.Type;

public interface RequestHelper {
    public static final RequestHelper INSTANCE = new RequestHelperImpl();

    public <T> T getRequest(WebResource wr, Type type);

    public <T> T getRequest(WebResource wr, String apiKey, Class<T> clazz);

    public <T> PaginationResult<T> getRequestExtended(WebResource wr, String apiKey, Class<T> clazz);

    public <T> T getRequest(WebResource wr, Class<T> clazz, String arg0Name, String arg0Value);

    public <T> T getRequest(WebResource wr, String apiKey, Class<T> clazz, String arg0Name, String arg0Value);

    public <T> PaginationResult<T> getRequestExtended(WebResource wr, String apiKey, Class<T> clazz, String arg0Name, String arg0Value);

    public <T> T getRequest(WebResource wr, Class<T> clazz, String arg0Name, String arg0Value, String arg1Name, String arg1Value);

    public <T> PaginationResult<T> getRequestExtended(WebResource wr, String apiKey, Class<T> clazz, String arg0Name, String arg0Value, String arg1Name, String arg1Value);
}
