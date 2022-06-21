package me.nithanim.gw2api.v2.api.traits;

import java.util.List;

import me.nithanim.gw2api.v2.ApiEndpoint;

/**
 * This resource returns information about specific traits which are contained within
 * specializations.
 */
public interface TraitsResource extends ApiEndpoint {
  int[] getOverview();

  Trait get(int id);

  List<Trait> get(int[] ids);

  Trait get(int id, String lang);

  List<Trait> get(int[] ids, String lang);

  List<Trait> getAll();

  List<Trait> getAll(String lang);
}
