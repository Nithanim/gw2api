package me.nithanim.gw2api.v2.api.files;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class File {
  private String id;
  private String icon;

  /**
   * The file identifier.
   *
   * @return
   */
  public String getId() {
    return id;
  }

  /**
   * The URL to the image.
   *
   * @return
   */
  public String getIcon() {
    return icon;
  }
}
