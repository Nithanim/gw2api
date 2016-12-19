package me.nithanim.gw2api.v2.api.items;

import me.nithanim.gw2api.v2.util.collections.IntObjMap;

public interface ItemsResource {
    int[] getOverview();
    
    ItemInfo get(int id);
    
    ItemInfo get(int id, String language);
    
    ItemInfo[] get(int[] ids);
    
    IntObjMap<ItemInfo> getMap(int[] ids);
    
    IntObjMap<ItemInfo> getMap(int[] ids, String lang);
    
    ItemInfo[] get(int[] ids, String language);
}
