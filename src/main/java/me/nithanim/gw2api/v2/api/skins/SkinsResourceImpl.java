package me.nithanim.gw2api.v2.api.skins;

import me.nithanim.gw2api.v2.util.rest.IdsResourceBaseInt;

public class SkinsResourceImpl extends IdsResourceBaseInt<Skin> implements SkinsResource {
  public SkinsResourceImpl(SkinsResourceWs ws) {
    super(ws);
  }
}
