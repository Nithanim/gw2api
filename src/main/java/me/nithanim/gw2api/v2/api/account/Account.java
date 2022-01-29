package me.nithanim.gw2api.v2.api.account;

import org.joda.time.DateTime;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Account {
  private String id;
  private String name;
  private int world = -1;
  private String[] guilds;
  private DateTime created;
  private Access access;
  private int fractalLevel = -1;
  private int dailyAp;
  private int monthlyAp;
  private int wvwRank;

  public enum Access {
    NONE,
    PLAY_FOR_FREE,
    GUILD_WARS_2,
    HEART_OF_THORNS;
  }
}
