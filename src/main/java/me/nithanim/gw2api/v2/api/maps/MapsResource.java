package me.nithanim.gw2api.v2.api.maps;

import me.nithanim.gw2api.v2.common.Language;

public interface MapsResource {
    int[] getOverview();

    Map get(int id);

    Map get(int id, Language lang);

    Map[] get(int[] id);

    Map[] get(int[] id, Language lang);
}
