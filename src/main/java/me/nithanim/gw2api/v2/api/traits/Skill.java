package me.nithanim.gw2api.v2.api.traits;

import java.util.Arrays;
import java.util.Objects;

public class Skill {
    private int id;
    private String name;
    private String description;
    private String icon;
    private Fact[] facts;
    private TraitedFact[] traitedFacts;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getIcon() {
        return icon;
    }

    public Fact[] getFacts() {
        return facts;
    }

    public TraitedFact[] getTraitedFacts() {
        return traitedFacts;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.id;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + Objects.hashCode(this.description);
        hash = 17 * hash + Objects.hashCode(this.icon);
        hash = 17 * hash + Arrays.deepHashCode(this.facts);
        hash = 17 * hash + Arrays.deepHashCode(this.traitedFacts);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Skill other = (Skill) obj;
        return this.id == other.id
            && Objects.equals(this.name, other.name)
            && Objects.equals(this.description, other.description)
            && Objects.equals(this.icon, other.icon)
            && Arrays.deepEquals(this.facts, other.facts)
            && Arrays.deepEquals(this.traitedFacts, other.traitedFacts);
    }
}
