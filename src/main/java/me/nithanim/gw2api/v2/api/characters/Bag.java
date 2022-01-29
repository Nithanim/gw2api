package me.nithanim.gw2api.v2.api.characters;

import me.nithanim.gw2api.v2.common.Item;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Bag {
  private int id;
  private int size;
  private Item[] inventory;
}
