package me.nithanim.gw2api.v2.api.recipes;

import java.util.List;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import me.nithanim.gw2api.v2.api.characters.CraftingDiscipline;
import me.nithanim.gw2api.v2.common.BasicItem;

@Value
@Builder
@Jacksonized
public class Recipe {
  @Builder.Default int id = -1;
  RecipeType type;
  @Builder.Default int outputItemId = -1;
  @Builder.Default int outputItemCount = -1;
  @Builder.Default int timeToCraftMs = -1;
  List<CraftingDiscipline> disciplines;
  @Builder.Default int minRating = -1;
  List<String> flags;
  List<BasicItem> ingredients;
  GuildIngredient guildIngredients;
  @Builder.Default int outputUpgradeId = -1;
  String chatLink;
}
