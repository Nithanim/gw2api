package me.nithanim.gw2api.v2.api.traits.facttypes;

import java.util.Objects;
import org.apache.commons.lang.builder.ToStringBuilder;

public class PrefixedBuffFact extends BuffFact {
    private Prefix prefix;

    public Prefix getPrefix() {
        return prefix;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 53 * hash + Objects.hashCode(this.prefix);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof PrefixedBuffFact)) {
            return false;
        } else if (this == obj) {
            return true;
        }
        final PrefixedBuffFact other = (PrefixedBuffFact) obj;
        return Objects.equals(this.prefix, other.prefix);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public static class Prefix {
        private String text;
        private String icon;
        private String status;
        private String description;

        public String getText() {
            return text;
        }

        public String getIcon() {
            return icon;
        }

        public String getStatus() {
            return status;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 71 * hash + Objects.hashCode(this.text);
            hash = 71 * hash + Objects.hashCode(this.icon);
            hash = 71 * hash + Objects.hashCode(this.status);
            hash = 71 * hash + Objects.hashCode(this.description);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            final Prefix other = (Prefix) obj;
            return Objects.equals(this.text, other.text)
                && Objects.equals(this.icon, other.icon)
                && Objects.equals(this.status, other.status)
                && Objects.equals(this.description, other.description);
        }

        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this);
        }
    }
}
