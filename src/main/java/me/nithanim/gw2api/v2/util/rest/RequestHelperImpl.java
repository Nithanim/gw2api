package me.nithanim.gw2api.v2.util.rest;

import java.lang.reflect.Type;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.Response;

import com.google.gson.JsonSyntaxException;

import me.nithanim.gw2api.v2.GuildWars2Api;
import me.nithanim.gw2api.v2.exceptions.GuildWars2ApiIOException;
import me.nithanim.gw2api.v2.exceptions.GuildWars2ApiMappingException;
import me.nithanim.gw2api.v2.exceptions.GuildWars2ApiRequestException;

public class RequestHelperImpl implements RequestHelper {
  private static final MultivaluedHashMap<String, Object> DEFAULT_HEADERS =
      new MultivaluedHashMap<>();

  static {
    DEFAULT_HEADERS.add("Accept", "application/json");
  }

  RequestHelperImpl() {}

  private static GuildWars2ApiIOException genWebApplicationException(Exception ex) {
    return new GuildWars2ApiIOException("The server could not handle the request!", ex);
  }

  static <T> T jsonToObject(String json, Type type) {
    try {
      // First try normal mapping
      return GuildWars2Api.GSON.fromJson(json, type);
    } catch (JsonSyntaxException mappingEx) {
      // If that fails...
      try {
        // Check if it is a error response in json format
        JsonApiError jae = GuildWars2Api.GSON.fromJson(json, JsonApiError.class);
        throw new GuildWars2ApiRequestException(
            "The api returned the following json error string: " + jae.getText());
      } catch (JsonSyntaxException droppedEx) {
        // If it was no json error then assume mapping to type failed
        throw new GuildWars2ApiMappingException(
            "Unable to map json to " + type + ": " + json, mappingEx);
      }
    }
  }

  @Override
  public <T> T getRequest(WebTarget wr, Type type) {
    try {
      String json = wr.request().headers(DEFAULT_HEADERS).get(String.class);
      return jsonToObject(json, type);
    } catch (ProcessingException | WebApplicationException ex) {
      throw genWebApplicationException(ex);
    }
  }

  @Override
  public <T> T getRequest(WebTarget wr, String apiKey, Class<T> clazz) {
    try {
      String json =
          wr.request()
              .headers(DEFAULT_HEADERS)
              .header("Authorization", "Bearer " + apiKey)
              .get(String.class);
      return jsonToObject(json, clazz);
    } catch (ProcessingException | WebApplicationException ex) {
      throw genWebApplicationException(ex);
    }
  }

  @Override
  public <T> PaginationResult<T> getRequestExtended(WebTarget wr, String apiKey, Class<T> clazz) {
    try {
      Response response =
          wr.request().headers(DEFAULT_HEADERS).header("Authorization", "Bearer " + apiKey).get();
      return new ResultImpl<>(response, clazz);
    } catch (ProcessingException | WebApplicationException ex) {
      throw genWebApplicationException(ex);
    }
  }

  @Override
  public <T> T getRequest(WebTarget wr, Type type, String arg0Name, String arg0Value) {
    try {
      String json =
          wr.queryParam(arg0Name, arg0Value).request().headers(DEFAULT_HEADERS).get(String.class);
      return jsonToObject(json, type);
    } catch (ProcessingException | WebApplicationException ex) {
      throw genWebApplicationException(ex);
    }
  }

  @Override
  public <T> T getRequest(
      WebTarget wr, String apiKey, Class<T> clazz, String arg0Name, String arg0Value) {
    try {
      String json =
          wr.queryParam(arg0Name, arg0Value)
              .request()
              .headers(DEFAULT_HEADERS)
              .header("Authorization", "Bearer " + apiKey)
              .get(String.class);
      return jsonToObject(json, clazz);
    } catch (ProcessingException | WebApplicationException ex) {
      throw genWebApplicationException(ex);
    }
  }

  @Override
  public <T> PaginationResult<T> getRequestExtended(
      WebTarget wr, String apiKey, Class<T> clazz, String arg0Name, String arg0Value) {
    try {
      Response response =
          wr.queryParam(arg0Name, arg0Value)
              .request()
              .headers(DEFAULT_HEADERS)
              .header("Authorization", "Bearer " + apiKey)
              .get();
      return new ResultImpl<>(response, clazz);
    } catch (ProcessingException | WebApplicationException ex) {
      throw genWebApplicationException(ex);
    }
  }

  @Override
  public <T> T getRequest(
      WebTarget wr,
      Type type,
      String arg0Name,
      String arg0Value,
      String arg1Name,
      String arg1Value) {
    try {
      String json =
          wr.queryParam(arg0Name, arg0Value)
              .queryParam(arg1Name, arg1Value)
              .request()
              .headers(DEFAULT_HEADERS)
              .get(String.class);
      return jsonToObject(json, type);
    } catch (ProcessingException | WebApplicationException ex) {
      throw genWebApplicationException(ex);
    }
  }

  @Override
  public <T> PaginationResult<T> getRequestExtended(
      WebTarget wr,
      String apiKey,
      Class<T> clazz,
      String arg0Name,
      String arg0Value,
      String arg1Name,
      String arg1Value) {
    try {
      Response response =
          wr.queryParam(arg0Name, arg0Value)
              .queryParam(arg1Name, arg1Value)
              .request()
              .headers(DEFAULT_HEADERS)
              .header("Authorization", "Bearer " + apiKey)
              .get();
      return new ResultImpl<>(response, clazz);
    } catch (ProcessingException | WebApplicationException ex) {
      throw genWebApplicationException(ex);
    }
  }

  private static class JsonApiError {
    private String text;

    public String getText() {
      return text;
    }
  }
}
