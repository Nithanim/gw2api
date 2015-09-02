package me.nithanim.gw2api.v2;

public class GuildWars2ApiDefaultConfig implements GuildWars2ApiConfig {
    @Override
    public String getBaseUrl() {
        return "https://api.guildwars2.com/v2/";
    }

    @Override
    public String getTransactionsCurrentBuysUrl() {
        return "https://api.guildwars2.com/v2/commerce/transactions/current/buys";
    }

    @Override
    public String getTransactionsCurrentSellsUrl() {
        return "https://api.guildwars2.com/v2/commerce/transactions/current/sells";
    }

    @Override
    public String getTransactionsHistoryBuysUrl() {
        return "https://api.guildwars2.com/v2/commerce/transactions/history/buys";
    }

    @Override
    public String getTransactionsHistorySellsUrl() {
        return "https://api.guildwars2.com/v2/commerce/transactions/history/sells";
    }
}
