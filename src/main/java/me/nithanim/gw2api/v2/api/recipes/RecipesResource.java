package me.nithanim.gw2api.v2.api.recipes;

import java.util.List;

import me.nithanim.gw2api.v2.ApiEndpoint;
import me.nithanim.gw2api.v2.ApiMidpoint;

public interface RecipesResource extends ApiMidpoint, ApiEndpoint {
  int[] getOverview();

  Recipe get(int id);

  List<Recipe> get(int[] ids);

  /**
   * Searches for all recipes where a specific item is an ingredient.
   *
   * @param id the item id which is an ingredient
   * @return the ids of the recipes where the item is an ingredient
   */
  int[] searchByInput(int id);

  /**
   * Searches for recipes where a specific item is created with it.
   *
   * @param id the item id which is an output
   * @return the ids of the recipes which creates this item
   */
  int[] searchByOutput(int id);
}
