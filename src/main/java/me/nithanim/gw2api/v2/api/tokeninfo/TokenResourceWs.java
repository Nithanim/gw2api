package me.nithanim.gw2api.v2.api.tokeninfo;

import javax.ws.rs.Path;

import me.nithanim.gw2api.v2.util.rest.IdsResourceWsObj;

@Path("tokeninfo")
public interface TokenResourceWs extends IdsResourceWsObj<String, TokenInfo> {}
