package me.nithanim.gw2api.v2.api.tokeninfo;

import java.util.List;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class TokenInfo {
  /** The api key that was requested */
  String id;
  /**
   * The name given to the API key by the account owner. <strong>Warning</strong>: The value of this
   * field is not escaped and may contain valid HTML, JavaScript, other code. Handle with care.
   */
  String name;
  /** Array of strings describing which permissions the API key has. */
  List<String> permissions;
}
