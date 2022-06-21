package me.nithanim.gw2api.v2.api.items;

import java.util.List;

public interface ItemsResource {
  int[] getOverview();

  ItemInfo get(int id);

  ItemInfo get(int id, String language);

  List<ItemInfo> get(int[] ids);

  List<ItemInfo> get(int[] ids, String language);
}
