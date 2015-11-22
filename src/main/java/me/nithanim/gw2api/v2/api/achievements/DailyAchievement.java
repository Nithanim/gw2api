package me.nithanim.gw2api.v2.api.achievements;

import org.apache.commons.lang.builder.ToStringBuilder;

public class DailyAchievement {
    private int id = -1;
    private int levelMin = -1;
    private int levelMax = -1;

    public DailyAchievement() {
    }

    public DailyAchievement(int id, int levelMin, int levelMax) {
        this.id = id;
        this.levelMin = levelMin;
        this.levelMax = levelMax;
    }

    public int getId() {
        return id;
    }

    public int getLevelMin() {
        return levelMin;
    }

    public int getLevelMax() {
        return levelMax;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id;
        hash = 97 * hash + this.levelMin;
        hash = 97 * hash + this.levelMax;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final DailyAchievement other = (DailyAchievement) obj;
        return this.id == other.id
            && this.levelMin == other.levelMin
            && this.levelMax == other.levelMax;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public static enum Type {
        PVE, PVP, WVW;
    }
}
