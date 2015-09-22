package me.nithanim.gw2api.v2.api.items;

import me.nithanim.gw2api.v2.api.items.details.*;

public enum ItemType {
    ARMOR(ArmorDetails.class), BACK(BackDetails.class), BAG(BackDetails.class), 
    CONSUMABLE(ConsumeableDetails.class), CONTAINER(ContainerDetails.class),
    CRAFTING_MATERIAL, GATHERING(GatheringToolsDetails.class),
    GIZMO(GizmoDetails.class), MINI_PET, TOOL(SalvageKitDetails.class),
    TRAIT, TRINKET(TrinketDetails.class), TROPHY,
    UPGRADE_COMPONENT(UpgradeComponentDetails.class),
    WEAPON(WeaponDetails.class);
    
    private final Class<? extends Details> detailsClass;

    private ItemType() {
        this(null);
    }
    
    private ItemType(Class<? extends Details> detailsClass) {
        this.detailsClass = detailsClass;
    }

    public Class<? extends Details> getDetailsClass() {
        return detailsClass;
    }
}
