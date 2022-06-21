package me.nithanim.gw2api.v2.api.build;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class Build {
  int id;
}
