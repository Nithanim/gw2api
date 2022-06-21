package me.nithanim.gw2api.v2.util.rest;

import java.util.List;

import lombok.RequiredArgsConstructor;
import me.nithanim.gw2api.v2.Language;

@RequiredArgsConstructor
public class IdsResourceBaseObjProtected<ID_CLASS, DATA_CLASS> {
  private final IdsResourceWsObj<ID_CLASS, DATA_CLASS> ws;

  public List<ID_CLASS> getOverview(String apikey) {
    return ws.getOverviewProtected(apikey);
  }

  public DATA_CLASS get(ID_CLASS id, String apikey) {
    return ws.getSingleProtected(id, apikey);
  }

  public DATA_CLASS get(ID_CLASS id, Language lang, String apikey) {
    return ws.getSingleProtected(id, lang.apiName(), apikey);
  }

  public List<DATA_CLASS> get(List<ID_CLASS> ids, String apikey) {
    return ws.getMultipleProtected(DataUtil.objectsToCommaSeparatedString(ids), apikey);
  }

  public List<DATA_CLASS> get(List<ID_CLASS> ids, Language lang, String apikey) {
    return ws.getMultipleProtected(
        DataUtil.objectsToCommaSeparatedString(ids), lang.apiName(), apikey);
  }

  public List<DATA_CLASS> getAll(String apikey) {
    return ws.getMultipleProtected("all", apikey);
  }

  public List<DATA_CLASS> getAll(Language lang, String apikey) {
    return ws.getMultipleProtected("all", lang.apiName(), apikey);
  }
}
