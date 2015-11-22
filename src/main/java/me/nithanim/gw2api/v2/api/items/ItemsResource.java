package me.nithanim.gw2api.v2.api.items;

import me.nithanim.gw2api.v2.common.Language;

public interface ItemsResource {
    int[] getOverview();

    ItemInfo get(int id);

    ItemInfo get(int id, Language lang);

    ItemInfo[] get(int[] ids);

    ItemInfo[] get(int[] ids, Language lang);
}
