package me.nithanim.gw2api.v2.common;

public class BasicItem {
    private int id;
    private int count = 1;

    public int getId() {
        return id;
    }

    public int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof BasicItem)) {
            return false;
        } else if (this == obj) {
            return true;
        }

        final BasicItem other = (BasicItem) obj;
        return super.equals(obj)
            && this.id == other.id
            && this.count == other.count;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.id;
        hash = 73 * hash + this.count;
        return hash;
    }
}
