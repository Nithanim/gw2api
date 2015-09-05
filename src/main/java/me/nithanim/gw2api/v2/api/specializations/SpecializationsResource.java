package me.nithanim.gw2api.v2.api.specializations;

import me.nithanim.gw2api.v2.ApiEndpoint;

/**
 * This resource returns information on currently released specializations. 
 */
public interface SpecializationsResource extends ApiEndpoint {
    int[] getOverview();

    Specialization get(int id);

    Specialization[] get(int[] ids);
    
    Specialization get(int id, String language);

    Specialization[] get(int[] ids, String language);
}
