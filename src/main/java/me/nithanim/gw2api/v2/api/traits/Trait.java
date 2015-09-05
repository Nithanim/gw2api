package me.nithanim.gw2api.v2.api.traits;

import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.lang.builder.ToStringBuilder;

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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIcon() {
        return icon;
    }

    public String getDescription() {
        return description;
    }

    public int getSpecialization() {
        return specialization;
    }

    public int getTier() {
        return tier;
    }

    public String getSlot() {
        return slot;
    }

    public Fact[] getFacts() {
        return facts;
    }

    public TraitedFact[] getTraitedFacts() {
        return traitedFacts;
    }

    public Skill[] getSkills() {
        return skills;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.id;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + Objects.hashCode(this.icon);
        hash = 23 * hash + Objects.hashCode(this.description);
        hash = 23 * hash + this.specialization;
        hash = 23 * hash + this.tier;
        hash = 23 * hash + Objects.hashCode(this.slot);
        hash = 23 * hash + Arrays.deepHashCode(this.facts);
        hash = 23 * hash + Arrays.deepHashCode(this.traitedFacts);
        hash = 23 * hash + Arrays.deepHashCode(this.skills);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Trait other = (Trait) obj;
        return this.id == other.id
            && Objects.equals(this.name, other.name)
            && Objects.equals(this.icon, other.icon)
            && Objects.equals(this.description, other.description)
            && this.specialization == other.specialization
            && this.tier == other.tier
            && Objects.equals(this.slot, other.slot)
            && Arrays.deepEquals(this.facts, other.facts)
            && Arrays.deepEquals(this.traitedFacts, other.traitedFacts)
            && Arrays.deepEquals(this.skills, other.skills);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
