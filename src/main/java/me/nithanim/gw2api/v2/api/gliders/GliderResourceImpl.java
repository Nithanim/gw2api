package me.nithanim.gw2api.v2.api.gliders;

import me.nithanim.gw2api.v2.util.rest.IdsResourceBaseInt;
import me.nithanim.gw2api.v2.util.rest.IdsResourceWsInt;

public class GliderResourceImpl extends IdsResourceBaseInt<Glider> implements GliderResource {
  public GliderResourceImpl(IdsResourceWsInt<Glider> ws) {
    super(ws);
  }
}
