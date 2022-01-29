package me.nithanim.gw2api.v2.api.specializations;

import javax.ws.rs.client.WebTarget;

import me.nithanim.gw2api.v2.util.rest.IdsResourceBase;

public class SpecializationsResourceImpl extends IdsResourceBase<Specialization, int[]>
    implements SpecializationsResource {
  public SpecializationsResourceImpl(WebTarget webTarget) {
    super(webTarget.path("specializations"), Specialization.class, int[].class);
  }
}
