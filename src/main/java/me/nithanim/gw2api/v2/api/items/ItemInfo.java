package me.nithanim.gw2api.v2.api.items;

import me.nithanim.gw2api.v2.common.BasicItem;
import me.nithanim.gw2api.v2.util.mappings.IntMappable;

@lombok.NoArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString
public class ItemInfo extends BasicItem implements IntMappable {
  private String name;
  private String icon;
  private String description;
  private String chatLink;
  private ItemType type;
  private ItemRarity rarity;
  private int level = -1;
  private int vendorValue = -1;
  private int defaultSkin = -1;
  private String[] flags;
  private GameType[] gameTypes;
  private String[] restrictions;
  private Details details;

  @Override
  public int getMappableId() {
    return getId();
  }

  /**
   * Returns an object containing additional information specific to the {@link ItemType}. The
   * resulting {@link Details} of this method has to be casted manually to the specialized subclass.
   *
   * <p>All the available subclasses can be found in the subpackage "details". The names of the
   * classes start with the type and ends with "Details". As an example, {@link ItemType.ARMOR}
   * relates to {@link me.nithanim.gw2api.v2.api.items.details.ArmorDetails}. You might want to use
   * your IDE to list all possible subclasses of {@link Details}.
   *
   * <p>As a sidenote: {@link ItemType#getDetailsClass()} returns the specific subclass of {@link
   * Details} for a specific {@link ItemType} if you ever need that for some reason.
   *
   * @param <T> automatic cast to the specialized subclass of {@link Details}
   * @return the {@link Details} object that contains all additional information for its {@link
   *     ItemType}. Needs to be casted manually to the specific subclass according to the {@link
   *     ItemType}.
   */
  public <T extends Details> T getDetails() {
    return (T) details;
  }

  void setDetails(Details details) {
    this.details = details;
  }
}
