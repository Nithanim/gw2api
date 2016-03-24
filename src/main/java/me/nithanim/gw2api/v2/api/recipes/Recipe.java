package me.nithanim.gw2api.v2.api.recipes;

import java.util.Arrays;
import java.util.Objects;
import me.nithanim.gw2api.v2.api.characters.CraftingDiscipline;
import me.nithanim.gw2api.v2.common.BasicItem;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Recipe {
    private int id;
    private RecipeType type;
    private int outputItemId;
    private int outputItemCount;
    private int timeToCraftMs;
    private CraftingDiscipline[] disciplines;
    private int minRating;
    private String[] flags;
    private BasicItem[] ingredients;
    private GuildIngredient[] guildIngredients;
    private int outputUpgradeId = -1;
    private String chatLink;

    public int getId() {
        return id;
    }

    public RecipeType getType() {
        return type;
    }

    public int getOutputItemId() {
        return outputItemId;
    }

    public int getOutputItemCount() {
        return outputItemCount;
    }

    public int getTimeToCraftMs() {
        return timeToCraftMs;
    }

    public CraftingDiscipline[] getDisciplines() {
        return disciplines;
    }

    public int getMinRating() {
        return minRating;
    }

    public String[] getFlags() {
        return flags;
    }

    public BasicItem[] getIngredients() {
        return ingredients;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.type);
        hash = 67 * hash + this.outputItemId;
        hash = 67 * hash + this.outputItemCount;
        hash = 67 * hash + this.timeToCraftMs;
        hash = 67 * hash + Arrays.deepHashCode(this.disciplines);
        hash = 67 * hash + this.minRating;
        hash = 67 * hash + Arrays.deepHashCode(this.flags);
        hash = 67 * hash + Arrays.deepHashCode(this.ingredients);
        hash = 67 * hash + Arrays.deepHashCode(this.guildIngredients);
        hash = 67 * hash + this.outputUpgradeId;
        hash = 67 * hash + Objects.hashCode(this.chatLink);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Recipe other = (Recipe) obj;
        return this.id == other.id
            && this.type == other.type
            && this.outputItemId == other.outputItemId
            && this.outputItemCount == other.outputItemCount
            && this.timeToCraftMs == other.timeToCraftMs
            && Arrays.deepEquals(this.disciplines, other.disciplines)
            && this.minRating == other.minRating
            && Arrays.deepEquals(this.flags, other.flags)
            && Arrays.deepEquals(this.ingredients, other.ingredients)
            && !Arrays.deepEquals(this.guildIngredients, other.guildIngredients)
            && this.outputUpgradeId == other.outputUpgradeId
            && Objects.equals(this.chatLink, other.chatLink);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
