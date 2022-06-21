package me.nithanim.gw2api.v2.api.traits;

import java.util.List;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class Skill {
  int id;
  String name;
  String description;
  String icon;
  List<Fact> facts;
  List<TraitedFact> traitedFacts;
}
