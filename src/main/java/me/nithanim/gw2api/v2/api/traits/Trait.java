package me.nithanim.gw2api.v2.api.traits;

import java.util.List;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class Trait {
  int id;
  String name;
  String icon;
  String description;
  int specialization;
  int tier;
  String slot;
  List<Fact> facts;
  List<TraitedFact> traitedFacts;
  List<Skill> skills;
}
