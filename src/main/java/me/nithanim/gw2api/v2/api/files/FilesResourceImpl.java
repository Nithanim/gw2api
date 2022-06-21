package me.nithanim.gw2api.v2.api.files;

import me.nithanim.gw2api.v2.util.rest.IdsResourceBaseObj;
import me.nithanim.gw2api.v2.util.rest.IdsResourceWsObj;

public class FilesResourceImpl extends IdsResourceBaseObj<String, File> implements FilesResource {
  public FilesResourceImpl(IdsResourceWsObj<String, File> ws) {
    super(ws);
  }
}
