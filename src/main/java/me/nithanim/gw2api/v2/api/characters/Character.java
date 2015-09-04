package me.nithanim.gw2api.v2.api.characters;

import java.util.EnumMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.joda.time.DateTime;

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

    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }

    public String getGender() {
        return gender;
    }

    public String getProfession() {
        return profession;
    }

    public byte getLevel() {
        return level;
    }

    public String getGuild() {
        return guild;
    }

    public int getAge() {
        return age;
    }

    public DateTime getCreated() {
        return created;
    }

    public int getDeaths() {
        return deaths;
    }

    public CraftingLevel[] getCrafting() {
        return crafting;
    }

    public Map<SpecializationType, Specialization[]> getSpecializations() {
        return specializations;
    }

    public WornItem[] getEquipment() {
        return equipment;
    }

    public Bag[] getBags() {
        return bags;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public static enum Race {
        ASURA, CHARR, HUMAN, NORN, SYLVARI;
    }

    public static enum Gender {
        MALE, FEMALE;
    }

    public static enum Profession {
        ELEMENTALIST, ENGINEER, GUARDIAN, MESMER, NECROMANCER, RANGER, THIEF, WARRIOR;
    }

}
