package me.nithanim.gw2api.v2.api.recipes;

import javax.ws.rs.Path;

import me.nithanim.gw2api.v2.util.rest.IdsResourceWsInt;

@Path("recipes")
public interface RecipesResourceWs extends IdsResourceWsInt<Recipe> {}
