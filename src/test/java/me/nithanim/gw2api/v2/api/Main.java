package me.nithanim.gw2api.v2.api;

import me.nithanim.gw2api.v2.GuildWars2Api;

public class Main {
  public static void main(String[] args) {

    GuildWars2Api api = new GuildWars2Api();

    // System.out.println(api.colors().get(10));
    // System.out.println(api.currencies().get(10));

    // System.out.println(api.gliders().get(1));

    // ItemInfo x = api.items().get(28445);
    // System.out.println(x);

    // System.out.println(api.build().get());

    // String key = "A83714F3-DD2D-2943-B420-5C92DDBF5212EE258A7A-C624-4AC0-80BF-302F5E701C64";
    // System.out.println(api.characters().get("Nindari", key));

    // System.out.println(api.skins().get(10));

    // System.out.println(Arrays.toString(api.recipes().searchByOutput(50065)));

    // System.out.println(api.specializations().get(1));

    System.out.println(api.traits().get(265));
  }
}
