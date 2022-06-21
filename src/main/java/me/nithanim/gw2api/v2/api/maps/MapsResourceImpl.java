package me.nithanim.gw2api.v2.api.maps;

import me.nithanim.gw2api.v2.util.rest.IdsResourceBaseInt;
import me.nithanim.gw2api.v2.util.rest.IdsResourceWsInt;

public class MapsResourceImpl extends IdsResourceBaseInt<WorldMap> implements MapsResource {
  public MapsResourceImpl(IdsResourceWsInt<WorldMap> ws) {
    super(ws);
  }
}
