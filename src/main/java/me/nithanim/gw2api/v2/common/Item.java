package me.nithanim.gw2api.v2.common;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@SuperBuilder
@Jacksonized
@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Item extends BasicItem {
  @Builder.Default int skin = -1;
  int[] upgrades;
  int[] infusions;
  Binding binding;
  String boundTo;

  public enum Binding {
    ACCOUNT,
    CHARACTER
  }
}
