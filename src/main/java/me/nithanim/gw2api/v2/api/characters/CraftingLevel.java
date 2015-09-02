package me.nithanim.gw2api.v2.api.characters;

import org.apache.commons.lang.builder.ToStringBuilder;

public class CraftingLevel {
    private String discipline;
    private int rating;
    private boolean active;

    public String getDiscipline() {
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
