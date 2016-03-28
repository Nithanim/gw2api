package me.nithanim.gw2api.v2.api.commerce.transactions;

import org.joda.time.DateTime;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Transaction {
    private long id;
    private int itemId;
    private int price;
    private int quantity;
    private DateTime created;
    private DateTime purchased;
}
