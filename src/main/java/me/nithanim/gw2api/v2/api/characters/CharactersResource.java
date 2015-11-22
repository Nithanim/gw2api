package me.nithanim.gw2api.v2.api.characters;

import com.sun.jersey.api.client.WebResource;
import me.nithanim.gw2api.v2.ApiEndpoint;
import me.nithanim.gw2api.v2.util.rest.RequestHelper;

/**
 * This resource returns information about characters attached to a specific
 * account.
 */
public class CharactersResource implements ApiEndpoint {
    private final WebResource webResource;

    public CharactersResource(WebResource webResource) {
        this.webResource = webResource.path("characters");
    }

    public String[] get(String apiKey) {
        return RequestHelper.getRequest(webResource, apiKey, String[].class);
    }

    public Character get(String character, String apiKey) {
        return RequestHelper.getRequest(webResource.path(character), apiKey, Character.class);
    }
}
