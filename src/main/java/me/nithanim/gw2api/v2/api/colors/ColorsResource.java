package me.nithanim.gw2api.v2.api.colors;

import me.nithanim.gw2api.v2.ApiEndpoint;
import me.nithanim.gw2api.v2.common.Language;

public interface ColorsResource extends ApiEndpoint {
    int[] getOverview();

    Color get(int id);

    Color get(int id, Language lang);

    Color[] get(int[] ids);

    Color[] get(int[] ids, Language lang);

    Color[] getAll();

    Color[] getAll(Language lang);
}
