package me.nithanim.gw2api.v2.api.characters;

import java.util.EnumMap;
import org.joda.time.DateTime;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Character {
    private String name;
    private Race race;
    private String gender;
    private String profession;
    private byte level;
    private String guild;
    private int age;
    private DateTime created;
    private int deaths;
    private CraftingLevel[] crafting;
    private EnumMap<SpecializationType, Specialization[]> specializations;
    private WornItem[] equipment;
    private Bag[] bags;

    public static enum Race {
        ASURA, CHARR, HUMAN, NORN, SYLVARI;
    }

    public static enum Gender {
        MALE, FEMALE;
    }

    public static enum Profession {
        ELEMENTALIST, ENGINEER, GUARDIAN, MESMER, NECROMANCER, RANGER, THIEF, WARRIOR, REVENANT;
    }
}
