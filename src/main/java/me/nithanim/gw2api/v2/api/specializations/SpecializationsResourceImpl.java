package me.nithanim.gw2api.v2.api.specializations;

import com.sun.jersey.api.client.WebResource;
import me.nithanim.gw2api.v2.util.rest.IdsResourceBase;

public class SpecializationsResourceImpl extends IdsResourceBase<Specialization, int[]> implements SpecializationsResource {
    public SpecializationsResourceImpl(WebResource webResource) {
        super(webResource.path("specializations"), Specialization.class, int[].class);
    }
}
