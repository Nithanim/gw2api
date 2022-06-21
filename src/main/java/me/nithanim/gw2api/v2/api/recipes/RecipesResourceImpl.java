package me.nithanim.gw2api.v2.api.recipes;

import me.nithanim.gw2api.v2.util.rest.IdsResourceBaseInt;

public class RecipesResourceImpl extends IdsResourceBaseInt<Recipe> implements RecipesResource {
  private final RecipesSearchResourceWs searchWs;

  public RecipesResourceImpl(RecipesResourceWs ws, RecipesSearchResourceWs searchWs) {
    super(ws);
    this.searchWs = searchWs;
  }

  @Override
  public int[] searchByInput(int id) {
    return searchWs.searchByInput(id);
  }

  @Override
  public int[] searchByOutput(int id) {
    return searchWs.searchByOutput(id);
  }
}
