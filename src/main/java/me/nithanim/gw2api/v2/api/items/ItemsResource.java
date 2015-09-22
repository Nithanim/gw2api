package me.nithanim.gw2api.v2.api.items;

public interface ItemsResource {
    int[] getOverview();
    
    ItemInfo get(int id);
    
    ItemInfo get(int id, String language);
    
    ItemInfo[] get(int[] ids);
    
    ItemInfo[] get(int[] ids, String language);
}
