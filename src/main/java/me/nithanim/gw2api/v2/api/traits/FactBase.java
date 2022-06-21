package me.nithanim.gw2api.v2.api.traits;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

/**
 * As I understood the hierarchy: There is a fact object that has additional fields based on the
 * "type" member.
 *
 * <p>-> Fact is the base and all sub-facts extend this.
 *
 * <p>Then the traited fact comes in. It fits between the Fact and the sub-facts but not all
 * sub-facts are tarited facts. They can have either the fact or the traited fact as parent.
 *
 * <p>So I merged the fact and the traited fact into this base class and created interfaces to
 * expose only the right methods.
 */
@SuperBuilder
@Jacksonized
@EqualsAndHashCode
@Getter
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@ToString
public class FactBase implements Fact, TraitedFact {
  String text;
  String icon;
  FactType type;

  @Builder.Default int requiresTrait = -1; // Merged into "Fact" from "Traited" fact
  @Builder.Default int overrides = -1; // Might have been a bad idea
}
