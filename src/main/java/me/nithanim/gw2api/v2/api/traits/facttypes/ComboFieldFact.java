package me.nithanim.gw2api.v2.api.traits.facttypes;

import me.nithanim.gw2api.v2.api.traits.FactBase;

@lombok.NoArgsConstructor
@lombok.Getter
@lombok.ToString
public class ComboFieldFact extends FactBase {
    private FieldType fieldType;

    public static enum FieldType {
        AIR, DARK, FIRE, ICE, LIGHT, LIGHTNING, POISON, SMOKE, ETHEREAL, WATER;
    }
}
