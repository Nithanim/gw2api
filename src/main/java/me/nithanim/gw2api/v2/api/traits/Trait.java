package me.nithanim.gw2api.v2.api.traits;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Trait {
    private int id;
    private String name;
    private String icon;
    private String description;
    private int specialization;
    private int tier;
    private String slot;
    private Fact[] facts;
    private TraitedFact[] traitedFacts;
    private Skill[] skills;
}
