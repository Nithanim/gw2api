package me.nithanim.gw2api.v2.util.rest;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import java.lang.reflect.Type;
import javax.ws.rs.core.MediaType;
import me.nithanim.gw2api.v2.GuildWars2Api;
import me.nithanim.gw2api.v2.GuildWars2ApiException;

public class RequestHelperImpl implements RequestHelper {
    @Override
    public <T> T getRequest(WebResource wr, Type type) {
        try {
            String json = wr
                .accept(MediaType.APPLICATION_JSON_TYPE)
                .get(String.class);
            return GuildWars2Api.GSON.fromJson(json, type);
        } catch (UniformInterfaceException ex) {
            throw handleUniformInterfaceException(ex);
        }
    }

    @Override
    public <T> T getRequest(WebResource wr, String apiKey, Class<T> clazz) {
        try {
            String json = wr
                .accept(MediaType.APPLICATION_JSON_TYPE)
                .header("Authorization", "Bearer " + apiKey)
                .get(String.class);
            return jsonToObject(json, clazz);
        } catch (UniformInterfaceException ex) {
            throw handleUniformInterfaceException(ex);
        }
    }

    @Override
    public <T> PaginationResult<T> getRequestExtended(WebResource wr, String apiKey, Class<T> clazz) {
        try {
            ClientResponse response = wr
                .header("Authorization", "Bearer " + apiKey)
                .accept(MediaType.APPLICATION_JSON_TYPE)
                .get(ClientResponse.class);
            return new ResultImpl<>(response, clazz);
        } catch (UniformInterfaceException ex) {
            throw handleUniformInterfaceException(ex);
        }
    }

    @Override
    public <T> T getRequest(WebResource wr, Class<T> clazz, String arg0Name, String arg0Value) {
        try {
            String json = wr
                .queryParam(arg0Name, arg0Value)
                .accept(MediaType.APPLICATION_JSON_TYPE)
                .get(String.class);
            return jsonToObject(json, clazz);
        } catch (UniformInterfaceException ex) {
            throw handleUniformInterfaceException(ex);
        }
    }

    @Override
    public <T> T getRequest(WebResource wr, String apiKey, Class<T> clazz, String arg0Name, String arg0Value) {
        try {
            String json = wr
                .queryParam(arg0Name, arg0Value)
                .header("Authorization", "Bearer " + apiKey)
                .accept(MediaType.APPLICATION_JSON_TYPE)
                .get(String.class);
            return jsonToObject(json, clazz);
        } catch (UniformInterfaceException ex) {
            throw handleUniformInterfaceException(ex);
        }
    }

    @Override
    public <T> PaginationResult<T> getRequestExtended(WebResource wr, String apiKey, Class<T> clazz, String arg0Name, String arg0Value) {
        try {
            ClientResponse response = wr
                .queryParam(arg0Name, arg0Value)
                .header("Authorization", "Bearer " + apiKey)
                .accept(MediaType.APPLICATION_JSON_TYPE)
                .get(ClientResponse.class);
            return new ResultImpl<>(response, clazz);
        } catch (UniformInterfaceException ex) {
            throw handleUniformInterfaceException(ex);
        }
    }

    @Override
    public <T> T getRequest(WebResource wr, Class<T> clazz, String arg0Name, String arg0Value, String arg1Name, String arg1Value) {
        try {
            String json = wr
                .queryParam(arg0Name, arg0Value)
                .queryParam(arg1Name, arg1Value)
                .accept(MediaType.APPLICATION_JSON_TYPE)
                .get(String.class);
            return jsonToObject(json, clazz);
        } catch (UniformInterfaceException ex) {
            throw handleUniformInterfaceException(ex);
        }
    }

    @Override
    public <T> PaginationResult<T> getRequestExtended(WebResource wr, String apiKey, Class<T> clazz, String arg0Name, String arg0Value, String arg1Name, String arg1Value) {
        try {
            ClientResponse response = wr
                .queryParam(arg0Name, arg0Value)
                .queryParam(arg1Name, arg1Value)
                .header("Authorization", "Bearer " + apiKey)
                .accept(MediaType.APPLICATION_JSON_TYPE)
                .get(ClientResponse.class);
            return new ResultImpl<>(response, clazz);
        } catch (UniformInterfaceException ex) {
            throw handleUniformInterfaceException(ex);
        }
    }

    private static GuildWars2ApiException handleUniformInterfaceException(UniformInterfaceException ex) {
        ClientResponse cr = ex.getResponse();
        ApiErrorText message = jsonToObject(cr.getEntity(String.class), ApiErrorText.class);
        return new GuildWars2ApiException("The server returned with message: " + message.getText(), ex);
    }

    static <T> T jsonToObject(String json, Class<T> clazz) {
        return GuildWars2Api.GSON.fromJson(json, clazz);
    }

    private static class ApiErrorText {
        private String text;

        public String getText() {
            return text;
        }
    }

    RequestHelperImpl() {
    }
}
