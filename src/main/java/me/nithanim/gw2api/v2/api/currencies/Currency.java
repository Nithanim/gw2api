package me.nithanim.gw2api.v2.api.currencies;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class Currency {
  @Builder.Default int id = -1;
  String name;
  String description;
  @Builder.Default int order = -1;
  String icon;

  /** The currency's ID. */
  public int getId() {
    return id;
  }

  /** The currency's name. */
  public String getName() {
    return name;
  }

  /** A description of the currency. */
  public String getDescription() {
    return description;
  }

  /**
   * A number that can be used to sort the list of currencies when ordered from least to greatest.
   */
  public int getOrder() {
    return order;
  }

  /** A URL to an icon for the currency. */
  public String getIcon() {
    return icon;
  }
}
