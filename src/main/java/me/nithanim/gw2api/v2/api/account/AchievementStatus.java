package me.nithanim.gw2api.v2.api.account;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.Arrays;

public class AchievementStatus {
    private int id = -1;
    private int current = -1;
    private int max = -1;
    private boolean done = false;
    private int[] bits;

    public int getId() {
        return id;
    }

    public int getCurrent() {
        return current;
    }

    public int getMax() {
        return max;
    }

    public boolean getDone() {
        return done;
    }

    public int[] getBits() {
        return bits;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final AchievementStatus other = (AchievementStatus) obj;
        return this.id == other.id
            && this.current == other.current
            && this.max == other.max
            && this.done == other.done
            && Arrays.equals(this.bits, other.bits);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        hash = 97 * hash + this.current;
        hash = 97 * hash + this.max;
        hash = 97 * hash + (this.done ? 1 : 0);
        hash = 97 * hash + Arrays.hashCode(bits);
        return hash;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
