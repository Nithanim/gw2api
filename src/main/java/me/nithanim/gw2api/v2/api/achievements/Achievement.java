package me.nithanim.gw2api.v2.api.achievements;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.Arrays;

public class Achievement {
    private int id;
    private int current;
    private int max;
    private boolean done;
    private int[] bits;

    public int getId() { return id; }
    public int getCurrent() { return current; }
    public int getMax() { return max; }
    public boolean getDone() { return done; }
    public int[] getBits() { return bits; }

    // @Override
    // public boolean equals(Object obj) {
    //     if (obj == null || getClass() != obj.getClass()) {
    //         return false;
    //     }
    //     final Achievement that = (Achievement) obj;
    //     return this.id == that.id
    //         && this.current == that.current
    //         && this.max == that.max
    //         && this.done == that.done
    //         && Arrays.deepEquals(this.bits, that.bits);
    // }

    // @Override
    // public long hashCode() {
    //     int hash = 7;
    //     hash = 97 * hash + this.id;
    //     hash = 97 * hash + this.current;
    //     hash = 97 * hash + this.max;
    //     hash = 97 * hash + this.done.hashCode();
    //     hash = 97 * hash + Arrays.deepHashCode(bits);
    //     return hash;
    // }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("current", current)
                .append("max", max)
                .append("done", done)
                .append("bits", bits)
                .toString();
    }
}
