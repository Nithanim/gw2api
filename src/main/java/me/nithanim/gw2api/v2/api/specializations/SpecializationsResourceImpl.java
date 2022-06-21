package me.nithanim.gw2api.v2.api.specializations;

import me.nithanim.gw2api.v2.util.rest.IdsResourceBaseInt;

public class SpecializationsResourceImpl extends IdsResourceBaseInt<Specialization>
    implements SpecializationsResource {
  public SpecializationsResourceImpl(SpecializationsResourceWs ws) {
    super(ws);
  }
}
