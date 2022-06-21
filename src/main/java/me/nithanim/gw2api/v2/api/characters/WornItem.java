package me.nithanim.gw2api.v2.api.characters;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;
import me.nithanim.gw2api.v2.common.Item;

@SuperBuilder
@Jacksonized
@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class WornItem extends Item {
  Slot slot;

  public enum Slot {
    HELM_AQUATIC,
    BACKPACK,
    COAT,
    BOOTS,
    GLOVES,
    HELM,
    LEGGINGS,
    SHOULDERS,
    ACCESSORY1,
    ACCESSORY2,
    RING1,
    RING2,
    AMULET,
    WEAPON_AQUATIC_A,
    WEAPON_AQUATIC_B,
    WEAPON_A1,
    WEAPON_A2,
    WEAPON_B1,
    WEAPON_B2,
    SICKLE,
    AXE,
    PICK
  }
}
