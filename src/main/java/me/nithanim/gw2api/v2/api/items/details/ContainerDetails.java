package me.nithanim.gw2api.v2.api.items.details;

import me.nithanim.gw2api.v2.api.items.Details;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class ContainerDetails implements Details {
    private ContainerType type;

    public static enum ContainerType {
        DEFAULT, GIFT_BOX, OPEN_UI;
    }
}
