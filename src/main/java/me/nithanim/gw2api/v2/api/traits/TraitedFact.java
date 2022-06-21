package me.nithanim.gw2api.v2.api.traits;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.CUSTOM,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type",
    visible = true)
@JsonTypeIdResolver(FactTypeResolver.class)
public interface TraitedFact extends Fact {
  int getRequiresTrait();

  /** Optional, -1 if not in response */
  int getOverrides();
}
