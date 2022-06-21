package me.nithanim.gw2api.v2.api.recipes;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("recipes/search")
public interface RecipesSearchResourceWs {
  @GET
  int[] searchByInput(@QueryParam("input") int id);

  @GET
  int[] searchByOutput(@QueryParam("output") int id);
}
