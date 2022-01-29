package me.nithanim.gw2api.v2.util.rest;

import java.lang.reflect.Type;

import javax.ws.rs.client.WebTarget;

public interface RequestHelper {
  public static final RequestHelper INSTANCE = new RequestHelperImpl();

  public <T> T getRequest(WebTarget wr, Type type);

  public <T> T getRequest(WebTarget wr, String apiKey, Class<T> clazz);

  public <T> PaginationResult<T> getRequestExtended(WebTarget wr, String apiKey, Class<T> clazz);

  public <T> T getRequest(WebTarget wr, Type type, String arg0Name, String arg0Value);

  public <T> T getRequest(
      WebTarget wr, String apiKey, Class<T> clazz, String arg0Name, String arg0Value);

  public <T> PaginationResult<T> getRequestExtended(
      WebTarget wr, String apiKey, Class<T> clazz, String arg0Name, String arg0Value);

  public <T> T getRequest(
      WebTarget wr,
      Type type,
      String arg0Name,
      String arg0Value,
      String arg1Name,
      String arg1Value);

  public <T> PaginationResult<T> getRequestExtended(
      WebTarget wr,
      String apiKey,
      Class<T> clazz,
      String arg0Name,
      String arg0Value,
      String arg1Name,
      String arg1Value);
}
