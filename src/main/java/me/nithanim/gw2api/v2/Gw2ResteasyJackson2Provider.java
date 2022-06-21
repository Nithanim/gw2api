package me.nithanim.gw2api.v2;

import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.plugins.providers.jackson.ResteasyJackson2Provider;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class Gw2ResteasyJackson2Provider extends ResteasyJackson2Provider {
  private final ObjectMapper objectMapper;

  @Override
  public ObjectMapper locateMapper(Class<?> type, MediaType mediaType) {
    return objectMapper;
  }
}
