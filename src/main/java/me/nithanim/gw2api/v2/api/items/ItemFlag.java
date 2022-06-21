package me.nithanim.gw2api.v2.api.items;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import me.nithanim.gw2api.v2.util.strings.StringUtil;

public enum ItemFlag {
  /** Account bound on use */
  AccountBindOnUse,
  /** Account bound on acquire */
  AccountBound,
  /** If the item is Attuned */
  Attuned,
  /** If the item can be bulk consumed */
  BulkConsume,
  /** If the item will prompt the player with a warning when deleting */
  DeleteWarning,
  /** Hide the suffix of the upgrade component */
  HideSuffix,
  /** If the item is infused */
  Infused,
  MonsterOnly,
  /** Not usable in the Mystic Forge */
  NoMysticForge,
  /** Not salvageable */
  NoSalvage,
  /** Not sellable */
  NoSell,
  /** Not upgradeable */
  NotUpgradeable,
  /** Not available underwater */
  NoUnderwater,
  /** Soulbound on acquire * */
  SoulbindOnAcquire,
  /** Soulbound on use */
  SoulBindOnUse,
  /** If the item is a tonic */
  Tonic,
  /** Unique */
  Unique;

  private static final Map<String, ItemFlag> LOOKUP;

  static {
    LOOKUP = new HashMap<>();
    for (ItemFlag itemFlag : values()) {
      LOOKUP.put(StringUtil.upperToPascalCase(itemFlag.name()), itemFlag);
    }
  }

  public static Optional<ItemFlag> fromApiName(String name) {
    return Optional.ofNullable(LOOKUP.get(name));
  }
}
