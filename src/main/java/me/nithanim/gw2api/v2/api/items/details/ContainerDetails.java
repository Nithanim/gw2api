package me.nithanim.gw2api.v2.api.items.details;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import me.nithanim.gw2api.v2.api.items.Details;

@Value
@Builder
@Jacksonized
public class ContainerDetails implements Details {
  ContainerType type;

  public enum ContainerType {
    DEFAULT,
    GIFT_BOX,
    OPEN_UI;
  }
}
