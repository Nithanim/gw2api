package me.nithanim.gw2api.v2.util.rest;

import java.util.List;

import lombok.RequiredArgsConstructor;
import me.nithanim.gw2api.v2.Language;

/**
 * This class aims to provide a base class that can handle various combinations with ids with
 * language and the apikey parameters. The resource that is given to the client must only expose the
 * methods that are really provided by the official api. This will most likely be only a subset of
 * these methods.
 *
 * @param <DATA_CLASS> The class of the object that is returned when the api is queried with an id
 */
@RequiredArgsConstructor
public class IdsResourceBaseInt<DATA_CLASS> {
  private final IdsResourceWsInt<DATA_CLASS> ws;

  public int[] getOverview() {
    return ws.getOverview();
  }

  public int[] getOverview(String apiKey) {
    return ws.getOverviewProtected(apiKey);
  }

  public DATA_CLASS get(int id) {
    return ws.getSingle(id);
  }

  public DATA_CLASS get(int id, String apiKey) {
    return ws.getSingleProtected(id, apiKey);
  }

  public DATA_CLASS get(int id, Language lang) {
    return ws.getSingle(id, lang.apiName());
  }

  public DATA_CLASS get(int id, Language lang, String apiKey) {
    return ws.getSingleProtected(id, lang.apiName(), apiKey);
  }

  public List<DATA_CLASS> get(int[] ids) {
    return ws.getMultiple(DataUtil.intsToCommaSeparatedString(ids));
  }

  public List<DATA_CLASS> get(int[] ids, String apiKey) {
    return ws.getMultipleProtected(DataUtil.intsToCommaSeparatedString(ids), apiKey);
  }

  public List<DATA_CLASS> get(int[] ids, Language lang) {
    return ws.getMultiple(DataUtil.intsToCommaSeparatedString(ids), lang.apiName());
  }

  public List<DATA_CLASS> get(int[] ids, Language lang, String apiKey) {
    return ws.getMultipleProtected(
        DataUtil.intsToCommaSeparatedString(ids), lang.apiName(), apiKey);
  }

  public List<DATA_CLASS> getAll() {
    return ws.getMultiple("all");
  }

  public List<DATA_CLASS> getAll(String apiKey) {
    return ws.getMultipleProtected("all", apiKey);
  }

  public List<DATA_CLASS> getAll(Language lang) {
    return ws.getMultiple("all", lang.apiName());
  }

  public List<DATA_CLASS> getAll(Language lang, String apiKey) {
    return ws.getMultipleProtected("all", lang.apiName(), apiKey);
  }
}
