package me.nithanim.gw2api.v2.api.tokeninfo;

/** This resource returns information about the supplied API key. */
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
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
   * The name given to the API key by the account owner. <strong>Warning</strong>: The value of this
   * field is not escaped and may contain valid HTML, JavaScript, other code. Handle with care.
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
}
