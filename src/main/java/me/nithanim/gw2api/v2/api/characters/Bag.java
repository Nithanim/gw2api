package me.nithanim.gw2api.v2.api.characters;

import java.util.List;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import me.nithanim.gw2api.v2.common.Item;

@Value
@Builder
@Jacksonized
public class Bag {
  int id;
  int size;
  List<Item> inventory;
}
