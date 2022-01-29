package me.nithanim.gw2api.v2.api.minis;

import javax.ws.rs.client.WebTarget;

import me.nithanim.gw2api.v2.util.rest.IdsResourceBase;

public class MinisResourceImpl extends IdsResourceBase<Mini, int[]> implements MinisResource {
  public MinisResourceImpl(WebTarget webTarget) {
    super(webTarget.path("minis"), Mini.class, int[].class);
  }
}
