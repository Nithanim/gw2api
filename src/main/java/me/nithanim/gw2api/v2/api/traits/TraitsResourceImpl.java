package me.nithanim.gw2api.v2.api.traits;

import me.nithanim.gw2api.v2.util.rest.IdsResourceBaseInt;

public class TraitsResourceImpl extends IdsResourceBaseInt<Trait> implements TraitsResource {
  public TraitsResourceImpl(TraitsResourceWs ws) {
    super(ws);
  }
}
