package me.nithanim.gw2api.v2.api.characters;

import me.nithanim.gw2api.v2.util.rest.IdsResourceBaseObjProtected;
import me.nithanim.gw2api.v2.util.rest.IdsResourceWsObj;

public class CharactersResourceImpl extends IdsResourceBaseObjProtected<String, Character>
    implements CharactersResource {
  public CharactersResourceImpl(IdsResourceWsObj<String, Character> ws) {
    super(ws);
  }
}
