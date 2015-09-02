package me.nithanim.gw2api.v2.api.commerce.exchange;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.joda.time.DateTime;

public class Transaction {
    private final long id;
    private final long itemId;
    private final int price;
    private final int quantity;
    private final DateTime created;
    private final DateTime purchased;

    public Transaction() {
        this.id = 0;
        this.itemId = 0;
        this.price = 0;
        this.quantity = 0;
        this.created = null;
        this.purchased = null;
    }

    public Transaction(long id, long itemId, int price, int quantity, DateTime created, DateTime purchased) {
        this.id = id;
        this.itemId = itemId;
        this.price = price;
        this.quantity = quantity;
        this.created = created;
        this.purchased = purchased;
    }

    public long getId() {
        return id;
    }

    public long getItemId() {
        return itemId;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public DateTime getCreated() {
        return created;
    }

    public DateTime getPurchased() {
        return purchased;
    }
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
