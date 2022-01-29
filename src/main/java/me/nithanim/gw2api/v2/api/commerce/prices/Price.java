package me.nithanim.gw2api.v2.api.commerce.prices;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Price {
  private int quantity;
  private int unitPrice;

  /**
   * The amount of items being sold/bought.
   *
   * @return
   */
  public int getQuantity() {
    return quantity;
  }

  /**
   * The highest buy order or lowest sell offer price in coins.
   *
   * @return
   */
  public int getUnitPrice() {
    return unitPrice;
  }
}
