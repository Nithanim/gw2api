package me.nithanim.gw2api.v2.api.characters;

import org.apache.commons.lang.builder.ToStringBuilder;

public class CraftingLevel {
    private CraftingDiscipline discipline;
    private int rating;
    private boolean active;

    public CraftingDiscipline getDiscipline() {
        return discipline;
    }

    public int getRating() {
        return rating;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
