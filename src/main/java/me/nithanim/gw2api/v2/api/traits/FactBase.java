package me.nithanim.gw2api.v2.api.traits;

import java.util.Objects;

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
public class FactBase implements Fact, TraitedFact {
    private String text;
    private String icon;
    private FactType type;

    private int requiresTrait = -1; //Merged into "Fact" from "Traited" fact
    private int overrides = -1; //Might have been a bad idea

    public String getText() {
        return text;
    }

    public String getIcon() {
        return icon;
    }

    public FactType getType() {
        return type;
    }

    public int getRequiresTrait() {
        return requiresTrait;
    }

    public int getOverrides() {
        return overrides;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.text);
        hash = 89 * hash + Objects.hashCode(this.icon);
        hash = 89 * hash + Objects.hashCode(this.type);
        hash = 89 * hash + requiresTrait;
        hash = 89 * hash + overrides;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Fact)) {
            return false;
        } else if (this == obj) {
            return true;
        }
        final FactBase other = (FactBase) obj;
        return Objects.equals(this.text, other.text)
            && Objects.equals(this.icon, other.icon)
            && this.type == other.type
            && this.requiresTrait == other.requiresTrait
            && this.overrides == other.overrides;
    }

}
