package me.nithanim.gw2api.v2.api.items.details;

import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.lang.builder.ToStringBuilder;

public class InfixUpgrade {
    private Attribute[] attributes;
    private Buff buff;

    public Attribute[] getAttributes() {
        return attributes;
    }

    public Buff getBuff() {
        return buff;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Arrays.deepHashCode(this.attributes);
        hash = 89 * hash + Objects.hashCode(this.buff);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InfixUpgrade other = (InfixUpgrade) obj;
        return Arrays.deepEquals(this.attributes, other.attributes)
            && Objects.equals(this.buff, other.buff);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public static class Attribute {
        private AttributeType attribute;
        private int modifier;

        public AttributeType getAttribute() {
            return attribute;
        }

        public int getModifier() {
            return modifier;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 37 * hash + Objects.hashCode(this.attribute);
            hash = 37 * hash + this.modifier;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            final Attribute other = (Attribute) obj;
            return this.attribute == other.attribute
                && this.modifier == other.modifier;
        }

        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this);
        }

        public static enum AttributeType {
            BOON_DURATION, CONDITION_DAMAGE, CONDITION_DURATION, CRIT_DAMAGE,
            HEALING, POWER, PRECISION, TOUGHNESS, VITALITY;
        }
    }

    public static class Buff {
        private int skillId;
        private String description;

        public int getSkillId() {
            return skillId;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 97 * hash + this.skillId;
            hash = 97 * hash + Objects.hashCode(this.description);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            final Buff other = (Buff) obj;
            return this.skillId == other.skillId
                && Objects.equals(this.description, other.description);
        }

        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this);
        }
    }
}
