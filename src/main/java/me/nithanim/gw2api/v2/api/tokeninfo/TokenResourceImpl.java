package me.nithanim.gw2api.v2.api.tokeninfo;

import me.nithanim.gw2api.v2.util.rest.IdsResourceBaseObj;

public class TokenResourceImpl extends IdsResourceBaseObj<String, TokenInfo>
    implements TokenResource {
  public TokenResourceImpl(TokenResourceWs ws) {
    super(ws);
  }
}
