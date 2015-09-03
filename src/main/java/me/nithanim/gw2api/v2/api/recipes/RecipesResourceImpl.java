package me.nithanim.gw2api.v2.api.recipes;

import com.sun.jersey.api.client.WebResource;
import me.nithanim.gw2api.v2.util.rest.IdsResourceBase;

public class RecipesResourceImpl extends IdsResourceBase<Recipe, int[]> implements RecipesResource {
    public RecipesResourceImpl(WebResource webResource) {
        super(webResource, "recipes", Recipe.class, int[].class);
    }
}
