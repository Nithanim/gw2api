package me.nithanim.gw2api.v2.api.pvp.games;

import me.nithanim.gw2api.v2.util.rest.IdsResourceBaseObjProtected;
import me.nithanim.gw2api.v2.util.rest.IdsResourceWsObj;

public class GamesResourceImpl extends IdsResourceBaseObjProtected<String, Game>
    implements GamesResource {
  public GamesResourceImpl(GamesResourceWs ws) {
    super(ws);
  }
}
