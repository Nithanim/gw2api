package me.nithanim.gw2api.v2.api.guild.upgrades;

public interface GuildUpgradesResource {
    int[] getOverview();

    GuildUpgrade get(int id);

    GuildUpgrade get(int id, String language);

    GuildUpgrade[] get(int[] ids);

    GuildUpgrade[] get(int[] ids, String language);
}
