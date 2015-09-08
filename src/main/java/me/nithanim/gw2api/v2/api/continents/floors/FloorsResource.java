package me.nithanim.gw2api.v2.api.continents.floors;

import me.nithanim.gw2api.v2.ApiEndpoint;
import me.nithanim.gw2api.v2.ApiMidpoint;
import me.nithanim.gw2api.v2.api.continents.floors.regions.RegionsResource;

public interface FloorsResource extends ApiEndpoint, ApiMidpoint {
    int[] getOverview();
    
    Floor get(int id);
    
    Floor get(int id, String language);
    
    Floor[] get(int[] id);
    
    Floor[] get(int[] id, String language);
    
    Floor[] getAll();
    
    Floor[] getAll(String language);
    
    RegionsResource regions(int floorId);
}
