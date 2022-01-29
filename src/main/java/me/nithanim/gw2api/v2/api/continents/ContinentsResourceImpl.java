package me.nithanim.gw2api.v2.api.continents;

import javax.ws.rs.client.WebTarget;

import me.nithanim.gw2api.v2.api.continents.floors.FloorsResource;
import me.nithanim.gw2api.v2.api.continents.floors.FloorsResourceImpl;
import me.nithanim.gw2api.v2.util.rest.IdsResourceBase;

public class ContinentsResourceImpl extends IdsResourceBase<Continent, int[]>
    implements ContinentsResource {
  public ContinentsResourceImpl(WebTarget webTarget) {
    super(webTarget.path("continents"), Continent.class, int[].class);
  }

  @Override
  public FloorsResource floors(int continentId) {
    return new FloorsResourceImpl(webTarget.path(String.valueOf(continentId)));
  }
}
