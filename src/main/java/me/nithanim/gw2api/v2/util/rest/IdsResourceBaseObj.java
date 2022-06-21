package me.nithanim.gw2api.v2.util.rest;

import java.util.List;

import lombok.RequiredArgsConstructor;
import me.nithanim.gw2api.v2.Language;

@RequiredArgsConstructor
public class IdsResourceBaseObj<ID_CLASS, DATA_CLASS> {
  private final IdsResourceWsObj<ID_CLASS, DATA_CLASS> ws;

  public List<ID_CLASS> getOverview() {
    return ws.getOverview();
  }

  public DATA_CLASS get(ID_CLASS id) {
    return ws.getSingle(id);
  }

  public DATA_CLASS get(ID_CLASS id, Language lang) {
    return ws.getSingle(id, lang.apiName());
  }

  public List<DATA_CLASS> get(List<ID_CLASS> ids) {
    return ws.getMultiple(DataUtil.objectsToCommaSeparatedString(ids));
  }

  public List<DATA_CLASS> get(List<ID_CLASS> ids, Language lang) {
    return ws.getMultiple(DataUtil.objectsToCommaSeparatedString(ids), lang.apiName());
  }

  public List<DATA_CLASS> getAll() {
    return ws.getMultiple("all");
  }

  public List<DATA_CLASS> getAll(Language lang) {
    return ws.getMultiple("all", lang.apiName());
  }
}
