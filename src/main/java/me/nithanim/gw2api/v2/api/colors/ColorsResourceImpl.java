package me.nithanim.gw2api.v2.api.colors;

import me.nithanim.gw2api.v2.util.rest.IdsResourceBaseInt;

public class ColorsResourceImpl extends IdsResourceBaseInt<Color> implements ColorsResource {
  public ColorsResourceImpl(ColorsResourceWs ws) {
    super(ws);
  }
}
