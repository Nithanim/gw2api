package me.nithanim.gw2api.v2.api.currencies;

import java.util.Objects;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Currency {
    private int id;
    private String name;
    private String description;
    private int order;
    private String icon;

    /**
     * The currency's ID.
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * The currency's name.
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * A description of the currency.
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * A number that can be used to sort the list of currencies when ordered
     * from least to greatest.
     *
     * @return
     */
    public int getOrder() {
        return order;
    }

    /**
     * A URL to an icon for the currency.
     *
     * @return
     */
    public String getIcon() {
        return icon;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.id;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + Objects.hashCode(this.description);
        hash = 47 * hash + this.order;
        hash = 47 * hash + Objects.hashCode(this.icon);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Currency other = (Currency) obj;
        return this.id == other.id
            && Objects.equals(this.name, other.name)
            && Objects.equals(this.description, other.description)
            && this.order == other.order
            && Objects.equals(this.icon, other.icon);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
