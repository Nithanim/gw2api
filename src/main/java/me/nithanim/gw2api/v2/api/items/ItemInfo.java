package me.nithanim.gw2api.v2.api.items;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;
import me.nithanim.gw2api.v2.common.BasicItem;
import me.nithanim.gw2api.v2.util.mappings.IntMappable;

@Value
@SuperBuilder
@Jacksonized
@EqualsAndHashCode(callSuper = true)
public class ItemInfo extends BasicItem implements IntMappable {
  String name;
  String icon;
  String description;
  String chatLink;
  ItemType type;
  ItemRarity rarity;
  @Builder.Default int level = -1;
  @Builder.Default int vendorValue = -1;
  @Builder.Default int defaultSkin = -1;
  Set<String> flags;
  Set<GameType> gameTypes;
  String[] restrictions;

  @JsonTypeInfo(
      use = JsonTypeInfo.Id.CUSTOM,
      include = JsonTypeInfo.As.EXTERNAL_PROPERTY,
      property = "type",
      visible = true)
  @JsonTypeIdResolver(ItemTypeResolver.class)
  Details details;

  @Override
  public int getMappableId() {
    return getId();
  }

  /**
   * Returns an object containing additional information specific to the {@link ItemType}. The
   * resulting {@link Details} of this method has to be casted manually to the specialized subclass.
   *
   * <p>All the available subclasses can be found in the subpackage "details". The names of the
   * classes start with the type and ends with "Details". As an example, {@link ItemType#ARMOR}
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
  @SuppressWarnings("unchecked")
  public <T extends Details> T getDetails() {
    return (T) details;
  }
}
