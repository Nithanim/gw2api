package me.nithanim.gw2api.v2.api.pvp.stats;

/** A class representing players collective stats. */
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class WinLoss {
  private int wins = -1;
  private int losses = -1;
  private int desertions = -1;
  private int byes = -1;
  private int forfeits = -1;
}
