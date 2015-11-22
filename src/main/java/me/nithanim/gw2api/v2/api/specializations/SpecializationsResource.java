package me.nithanim.gw2api.v2.api.specializations;

import me.nithanim.gw2api.v2.ApiEndpoint;
import me.nithanim.gw2api.v2.common.Language;

/**
 * This resource returns information on currently released specializations.
 */
public interface SpecializationsResource extends ApiEndpoint {
    int[] getOverview();

    Specialization get(int id);

    Specialization[] get(int[] ids);

    Specialization get(int id, Language lang);

    Specialization[] get(int[] ids, Language lang);
}
