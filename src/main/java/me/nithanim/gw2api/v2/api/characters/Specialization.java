package me.nithanim.gw2api.v2.api.characters;

import java.util.List;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class Specialization {
  int id;

  List<Integer> traits;
}
