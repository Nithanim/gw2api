package me.nithanim.gw2api.v2.api.items.details;

import me.nithanim.gw2api.v2.api.items.Details;
import me.nithanim.gw2api.v2.common.WeightClass;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class ArmorDetails implements Details {
    private ArmorSlotType type;
    private WeightClass weightClass;
    private int defence;
    private InfusionSlot[] infusionSlots;
    private InfixUpgrade infixUpgrade;
    private int suffixItemId = -1;
    private String secondarySuffixItemId;

    public static enum ArmorSlotType {
        BOOTS, COAT, GLOVES, HELM, HELM_AQUATIC, LEGGINGS, SHOULDERS;
    }
}
