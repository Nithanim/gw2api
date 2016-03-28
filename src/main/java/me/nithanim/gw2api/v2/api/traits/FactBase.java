package me.nithanim.gw2api.v2.api.traits;

/**
 * As I understood the hierarchy: There is a fact object that has additional
 * fields based on the "type" member.
 *
 * -> Fact is the base and all sub-facts extend this.
 *
 * Then the traited fact comes in. It fits between the Fact and the sub-facts
 * but not all sub-facts are tarited facts. They can have either the fact or the
 * traited fact as parent.
 *
 * So I merged the fact and the traited fact into this base class and created
 * interfaces to expose only the right methods.
 *
 */
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class FactBase implements Fact, TraitedFact {
    private String text;
    private String icon;
    private FactType type;

    private int requiresTrait = -1; //Merged into "Fact" from "Traited" fact
    private int overrides = -1; //Might have been a bad idea
}
