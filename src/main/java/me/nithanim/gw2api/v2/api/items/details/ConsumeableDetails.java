package me.nithanim.gw2api.v2.api.items.details;

import me.nithanim.gw2api.v2.api.items.Details;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class ConsumeableDetails implements Details {
    private ConsumeableType type;
    private String description;
    private int durationMs = -1;
    private String unlockType;
    private int colorId = -1;
    private int recipeId = -1;

    public static enum ConsumeableType {
        APPEARANCE_CHANGE, BOOZE, CONTRACT_NPC, FOOD, GENERIC, HALLOWEEN,
        IMMEDIATE, TRANSMUTATION, UNLOCK, UPGRADE_REMOVAL, UTILITY;
    }
}
