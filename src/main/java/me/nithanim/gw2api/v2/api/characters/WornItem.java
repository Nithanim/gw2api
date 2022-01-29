package me.nithanim.gw2api.v2.api.characters;

import me.nithanim.gw2api.v2.common.Item;

@lombok.NoArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString
public class WornItem extends Item {
  private Slot slot;

  public static enum Slot {
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
    PICK;
  }
}
