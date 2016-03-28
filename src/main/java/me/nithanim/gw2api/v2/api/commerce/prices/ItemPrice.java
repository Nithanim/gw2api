package me.nithanim.gw2api.v2.api.commerce.prices;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class ItemPrice {
    private int id;
    private Price buys;
    private Price sells;
}
