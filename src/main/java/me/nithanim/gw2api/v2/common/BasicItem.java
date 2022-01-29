package me.nithanim.gw2api.v2.common;

import com.google.gson.annotations.SerializedName;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class BasicItem {
  @SerializedName(value = "id", alternate = "item_id")
  private int id = -1;

  private int count = 1;
}
