package me.nithanim.gw2api.v2.api.items.details;

import me.nithanim.gw2api.v2.api.items.Details;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class SalvageKitDetails implements Details {
    private SalvageKitType type;
    private int charges = -1;

    public static enum SalvageKitType {
        SALVAGE;
    }
}
