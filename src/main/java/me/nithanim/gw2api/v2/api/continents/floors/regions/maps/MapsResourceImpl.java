package me.nithanim.gw2api.v2.api.continents.floors.regions.maps;

import javax.ws.rs.client.WebTarget;

import me.nithanim.gw2api.v2.util.rest.IdsResourceBase;

public class MapsResourceImpl extends IdsResourceBase<Map, int[]> implements MapsResource {
  public MapsResourceImpl(WebTarget webTarget) {
    super(webTarget.path("maps"), Map.class, int[].class);
  }
}
