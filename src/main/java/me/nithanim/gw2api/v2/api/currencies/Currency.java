package me.nithanim.gw2api.v2.api.currencies;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Currency {
  private int id = -1;
  private String name;
  private String description;
  private int order = -1;
  private String icon;

  /**
   * The currency's ID.
   *
   * @return
   */
  public int getId() {
    return id;
  }

  /**
   * The currency's name.
   *
   * @return
   */
  public String getName() {
    return name;
  }

  /**
   * A description of the currency.
   *
   * @return
   */
  public String getDescription() {
    return description;
  }

  /**
   * A number that can be used to sort the list of currencies when ordered from least to greatest.
   *
   * @return
   */
  public int getOrder() {
    return order;
  }

  /**
   * A URL to an icon for the currency.
   *
   * @return
   */
  public String getIcon() {
    return icon;
  }
}
