package me.nithanim.gw2api.v2;

public interface GuildWars2ApiConfig {
    String getBaseUrl();
    String getTransactionsCurrentBuysUrl();
    String getTransactionsCurrentSellsUrl();
    String getTransactionsHistoryBuysUrl();
    String getTransactionsHistorySellsUrl();
}
