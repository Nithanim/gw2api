package me.nithanim.gw2api.v2.api.recipes;

import me.nithanim.gw2api.v2.ApiEndpoint;
import me.nithanim.gw2api.v2.ApiMidpoint;

public interface RecipesResource extends ApiMidpoint, ApiEndpoint {
    int[] getOverview();

    Recipe get(int id);

    Recipe[] get(int[] ids);
}
