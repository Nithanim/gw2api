package me.nithanim.gw2api.v2.api.characters;

import me.nithanim.gw2api.v2.common.Item;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Bag {
    private int id;
    private int size;
    private Item[] inventory;

    public int getId() {
        return id;
    }

    public int getSize() {
        return size;
    }

    public Item[] getInventory() {
        return inventory;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
