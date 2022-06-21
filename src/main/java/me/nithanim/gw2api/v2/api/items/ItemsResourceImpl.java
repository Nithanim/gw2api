package me.nithanim.gw2api.v2.api.items;

import me.nithanim.gw2api.v2.util.rest.IdsResourceBaseInt;

public class ItemsResourceImpl extends IdsResourceBaseInt<ItemInfo> implements ItemsResource {
  public ItemsResourceImpl(ItemsResourceWs ws) {
    super(ws);
  }
}
