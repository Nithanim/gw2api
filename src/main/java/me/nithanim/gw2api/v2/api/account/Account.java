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
}
