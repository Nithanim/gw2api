package me.nithanim.gw2api.v2.api.items;

import javax.ws.rs.Path;

import me.nithanim.gw2api.v2.util.rest.IdsResourceWsInt;

@Path("items")
public interface ItemsResourceWs extends IdsResourceWsInt<ItemInfo> {}
