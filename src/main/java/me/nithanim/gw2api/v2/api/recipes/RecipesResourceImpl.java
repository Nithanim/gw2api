package me.nithanim.gw2api.v2.api.recipes;

import javax.ws.rs.client.WebTarget;
import me.nithanim.gw2api.v2.util.rest.IdsResourceBase;
import me.nithanim.gw2api.v2.util.rest.RequestHelper;

public class RecipesResourceImpl extends IdsResourceBase<Recipe, int[]> implements RecipesResource {
    private final WebTarget searchWebTarget;

    public RecipesResourceImpl(WebTarget webResource) {
        super(webResource.path("recipes"), Recipe.class, int[].class);
        searchWebTarget = this.webTarget.path("search");
    }

    @Override
    public int[] searchByInput(int id) {
        return RequestHelper.INSTANCE.getRequest(searchWebTarget, int[].class, "input", String.valueOf(id));
    }

    @Override
    public int[] searchByOutput(int id) {
        return RequestHelper.INSTANCE.getRequest(searchWebTarget, int[].class, "output", String.valueOf(id));
    }
}
