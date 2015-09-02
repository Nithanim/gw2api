package me.nithanim.gw2api.v2.api.characters;

import java.util.Objects;
import me.nithanim.gw2api.v2.api.items.Item;

public class WornItem extends Item {
    private Slot slot;

    @Override
    public int getCount() {
        return 1;
    }

    public Slot getSlot() {
        return slot;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof WornItem)) {
            return false;
        } else if (this == obj) {
            return true;
        }

        final WornItem other = (WornItem) obj;
        return super.equals(obj)
            && this.slot == other.slot;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 73 * hash + Objects.hash(slot);
        return hash;
    }

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
