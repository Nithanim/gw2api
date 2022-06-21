package me.nithanim.gw2api.v2.api.characters;

import javax.ws.rs.Path;

import me.nithanim.gw2api.v2.util.rest.IdsResourceWsObj;

@Path("characters")
public interface CharactersResourceWs extends IdsResourceWsObj<String, Character> {}
