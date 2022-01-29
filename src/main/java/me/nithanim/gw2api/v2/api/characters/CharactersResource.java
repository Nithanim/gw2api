package me.nithanim.gw2api.v2.api.characters;

import javax.ws.rs.client.WebTarget;

import me.nithanim.gw2api.v2.ApiEndpoint;
import me.nithanim.gw2api.v2.util.rest.RequestHelper;

/** This resource returns information about characters attached to a specific account. */
public class CharactersResource implements ApiEndpoint {
  private final WebTarget webTarget;

  public CharactersResource(WebTarget webResource) {
    this.webTarget = webResource.path("characters");
  }

  public String[] get(String apiKey) {
    return RequestHelper.INSTANCE.getRequest(webTarget, apiKey, String[].class);
  }

  public Character get(String character, String apiKey) {
    return RequestHelper.INSTANCE.getRequest(webTarget.path(character), apiKey, Character.class);
  }
}
