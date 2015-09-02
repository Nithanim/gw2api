package me.nithanim.gw2api.v2.api.account;

import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.joda.time.DateTime;

public class Account {
    private String id;
    private String name;
    private int world;
    private String[] guilds;
    private DateTime created;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWorld() {
        return world;
    }

    public String[] getGuilds() {
        return guilds;
    }

    public DateTime getCreated() {
        return created;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + this.world;
        hash = 97 * hash + Arrays.deepHashCode(this.guilds);
        hash = 97 * hash + Objects.hashCode(this.created);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Account other = (Account) obj;
        return Objects.equals(this.id, other.id)
            && Objects.equals(this.name, other.name)
            && this.world == other.world
            && Arrays.deepEquals(this.guilds, other.guilds)
            && Objects.equals(this.created, other.created);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
