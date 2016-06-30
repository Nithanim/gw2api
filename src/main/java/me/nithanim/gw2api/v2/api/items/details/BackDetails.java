package me.nithanim.gw2api.v2.api.items.details;

import me.nithanim.gw2api.v2.api.items.Details;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class BackDetails implements Details {
    private InfusionSlot[] infusionSlots;
    private InfixUpgrade infixUpgrade;
    private int suffixItemId = -1;
    private String secondarySuffixItemId;
}
