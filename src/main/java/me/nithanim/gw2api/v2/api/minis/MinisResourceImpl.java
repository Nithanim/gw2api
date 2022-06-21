package me.nithanim.gw2api.v2.api.minis;

import me.nithanim.gw2api.v2.util.rest.IdsResourceBaseInt;
import me.nithanim.gw2api.v2.util.rest.IdsResourceWsInt;

public class MinisResourceImpl extends IdsResourceBaseInt<Mini> implements MinisResource {
  public MinisResourceImpl(IdsResourceWsInt<Mini> ws) {
    super(ws);
  }
}
