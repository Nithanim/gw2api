package me.nithanim.gw2api.v2.api.files;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class File {
  String id;
  String icon;

  /** The file identifier. */
  public String getId() {
    return id;
  }

  /** The URL to the image. */
  public String getIcon() {
    return icon;
  }
}
