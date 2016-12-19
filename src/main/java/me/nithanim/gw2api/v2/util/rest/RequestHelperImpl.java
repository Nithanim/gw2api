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
    public <T> T getRequest(WebResource wr, Type type, String arg0Name, String arg0Value) {
        try {
            String json = wr
                .queryParam(arg0Name, arg0Value)
                .accept(MediaType.APPLICATION_JSON_TYPE)
                .get(String.class);
            return jsonToObject(json, type);
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
    public <T> T getRequest(WebResource wr, Type type, String arg0Name, String arg0Value, String arg1Name, String arg1Value) {
        try {
            String json = wr
                .queryParam(arg0Name, arg0Value)
                .queryParam(arg1Name, arg1Value)
                .accept(MediaType.APPLICATION_JSON_TYPE)
                .get(String.class);
            return jsonToObject(json, type);
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
        String body = cr.getEntity(String.class);
        try {
            ApiErrorText message = jsonToObject(body, ApiErrorText.class);
            return new GuildWars2ApiException("The servers json message was: " + message.getText(), ex);
        } catch (Exception ex2) {
            return new GuildWars2ApiException(
                "For this request, the server answered with status " + cr.getStatus()
                + " and the following document: " + body,
                ex
            );
        }
    }

    static <T> T jsonToObject(String json, Type type) {
        return GuildWars2Api.GSON.fromJson(json, type);
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
