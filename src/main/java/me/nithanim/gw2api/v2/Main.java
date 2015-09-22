package me.nithanim.gw2api.v2;

import java.util.Arrays;
import me.nithanim.gw2api.v2.api.commerce.exchange.Transaction;
import me.nithanim.gw2api.v2.api.characters.Character;
import me.nithanim.gw2api.v2.api.characters.SpecializationType;
import me.nithanim.gw2api.v2.api.commerce.listings.Listing;
import me.nithanim.gw2api.v2.common.Item;

public class Main {

    public static void main(String[] args) {
        //String apikey = "F735A191-002A-1341-862C-AFB2CC0299C9D97D20C1-4C17-4626-ADD9-65C557B7027A";
        String apikey = "49E407D3-4682-7646-AFDF-4F249B09F67451FCEF55-48F2-467E-922D-9AA0B38A30D0";

        GuildWars2Api gw2api = new GuildWars2Api();
        //System.out.println(Arrays.toString(gw2api.account().bank(apikey)));
        //System.out.println(Arrays.toString(gw2api.account().dyes(apikey)));
        //System.out.println(Arrays.toString(gw2api.account().materials(apikey)));
        //System.out.println(Arrays.toString(gw2api.account().skins(apikey)));
        //System.out.println(Arrays.toString(gw2api.account().wallet(apikey)));
        //System.out.println(Arrays.toString(gw2api.colors().get()));
        //System.out.println(gw2api.colors().get(1));
        //System.out.println(gw2api.commerce().exchange().coinsPerGem(100));
        //System.out.println(Arrays.toString(gw2api.commerce().listings().get()));
        //System.out.println(gw2api.commerce().listings().get(100));
        //System.out.println(Arrays.toString(gw2api.commerce().listings().get(new int[] {100, 50})));
        //System.out.println(Arrays.toString(gw2api.currencies().getOverview()));
        //System.out.println(gw2api.currencies().get(1));
        //System.out.println(Arrays.toString(gw2api.currencies().get(new int[] {2, 3}, "de")));
        //int[] allListingsAvailable = gw2api.commerce().listings().getOverview();
        //Listing listing = gw2api.commerce().listings().get(allListingsAvailable[0]);
        //System.out.println(listing.toString());
        /*Transaction[] transactions = gw2api
         .commerce()
         .transactions()
         .historyBuys(apikey);*/
        //System.out.println(gw2api.account().get(apikey).getName());
        //System.out.println(Arrays.toString(gw2api.account().bank().get(apikey)));
        //System.out.println(Arrays.toString(gw2api.account().materials().get(apikey)));
        //System.out.println("Build: " + gw2api.build().get().getId());
        //Character c = gw2api.character().get("Nindari", apikey);
        //System.out.println(Arrays.toString(c.getBags()));

        //System.out.println(Arrays.toString(gw2api.commerce().prices().getOverview()));
        //System.out.println(gw2api.commerce().prices().get(24));
        //System.out.println(Arrays.toString(gw2api.commerce().prices().get(new int[] {24, 68})));
        
        //System.out.println(Arrays.toString(gw2api.recipes().getOverview()));
        //System.out.println(gw2api.recipes().get(7319));
        //System.out.println(Arrays.toString(gw2api.recipes().get(new int[] {7319, 50})));
        
        //System.out.println(Arrays.toString(gw2api.recipes().searchByInput(46731)));
        //System.out.println(Arrays.toString(gw2api.recipes().searchByOutput(50065)));
        
        //System.out.println(Arrays.toString(gw2api.characters().get("Nindari", "49E407D3-4682-7646-AFDF-4F249B09F67451FCEF55-48F2-467E-922D-9AA0B38A30D0").getSpecializations().get(SpecializationType.PVE)));

        //System.out.println(gw2api.skins().get(10, "fr"));
        
        //System.out.println(gw2api.traits().get(214));
        
        //System.out.println(Arrays.toString(gw2api.files().getAll()));
        //System.out.println(Arrays.toString(gw2api.maps().get(new int[] {15, 17}, "fr")));
        
        
        //System.out.println(gw2api.continents().floors(1).regions(regionId));
        //System.out.println(gw2api.continents().floors(1).get(5));
        
        //System.out.println(Arrays.toString(gw2api.pvp().games().getOverview(apikey)));
        
        System.out.println(gw2api.items().get(12452));
        
        /*System.out.println(Arrays.toString(gw2api.worlds().getOverview()));
         System.out.println(gw2api.worlds().get(2206));
         System.out.println(gw2api.worlds().get(2206).isEurope());
         System.out.println(gw2api.worlds().get(2206).isNorthAmerica());
         System.out.println(gw2api.worlds().get(2206).isGerman());
         System.out.println(gw2api.worlds().get(2102).isFrench());*/
        //System.out.println(gw2api.worlds().get(2206, "sp"));
        //System.out.println(Arrays.toString(gw2api.worlds().get(new int[] {1001, 2206})));
    }
}
