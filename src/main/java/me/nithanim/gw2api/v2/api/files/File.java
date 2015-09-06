package me.nithanim.gw2api.v2.api.files;

import java.util.Objects;
import org.apache.commons.lang.builder.ToStringBuilder;

public class File {
    private String id;
    private String icon;

    /**
     * The file identifier.
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * The URL to the image.
     *
     * @return
     */
    public String getIcon() {
        return icon;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.icon);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final File other = (File) obj;
        return Objects.equals(this.id, other.id)
            && Objects.equals(this.icon, other.icon);
    }

    @Override
    public String toString() {
        Class<Integer> a = int.class;
        return ToStringBuilder.reflectionToString(this);
    }
}
