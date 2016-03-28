package me.nithanim.gw2api.v2.api.characters;

import me.nithanim.gw2api.v2.util.gson.characters.TraitDeserializer;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Specialization {
    private int id;
    @com.google.gson.annotations.JsonAdapter(TraitDeserializer.class)
    private int[] traits;
}
