package me.nithanim.gw2api.v2.api.tokeninfo;

import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * This resource returns information about the supplied API key. 
 */
public class TokenInfo {
    private String id;
    private String name;
    private String[] permissions;

    /**
     * The api key that was requested
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * The name given to the API key by the account owner.
     * <strong>Warning</strong>: The value of this field is not escaped and may
     * contain valid HTML, JavaScript, other code. Handle with care.
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Array of strings describing which permissions the API key has.
     *
     * @return
     */
    public String[] getPermissions() {
        return permissions;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Arrays.deepHashCode(this.permissions);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final TokenInfo other = (TokenInfo) obj;
        return Objects.equals(this.id, other.id)
            && Objects.equals(this.name, other.name)
            && Arrays.deepEquals(this.permissions, other.permissions);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
