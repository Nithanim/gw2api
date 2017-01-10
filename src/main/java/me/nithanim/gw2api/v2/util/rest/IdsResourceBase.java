package me.nithanim.gw2api.v2.util.rest;

import javax.ws.rs.client.WebTarget;
import me.nithanim.gw2api.v2.util.collections.IntObjMap;
import me.nithanim.gw2api.v2.util.mappings.IntMappable;
import me.nithanim.gw2api.v2.util.reflect.LibraryAvailabilityChecker;
import me.nithanim.gw2api.v2.util.reflect.ReflectUtil;
import me.nithanim.gw2api.v2.util.reflect.SimpleParameterizedType;

/**
 * This class aims to provide a base class that can handle various combinations
 * with ids with language and the apikey parameters. The resource that is given
 * to the client must only expose the methods that are really provided by the
 * official api. This will most likely be only a subset of this methods.
 *
 * @param <DATA_CLASS> The class of the object that is returned when the api is
 * queried with an id
 * @param <OVERVIEW_CLASS> The class of the object that is returned when
 * querying all possible ids
 */
public class IdsResourceBase<DATA_CLASS, OVERVIEW_CLASS> {
    protected final WebTarget webTarget;
    private final Class<DATA_CLASS> dataClass;
    private final Class<DATA_CLASS[]> dataClassArray;
    private final Class<OVERVIEW_CLASS> overviewClass;

    private final SimpleParameterizedType mapType;

    public IdsResourceBase(WebTarget webTarget, Class<DATA_CLASS> dataClass, Class<OVERVIEW_CLASS> overviewClass) {
        this.webTarget = webTarget;
        this.dataClass = dataClass;
        this.dataClassArray = ReflectUtil.getArrayClass(dataClass);
        this.overviewClass = overviewClass;

        if (IntMappable.class.isAssignableFrom(dataClass) && LibraryAvailabilityChecker.checkKoloboke()) {
            mapType = new SimpleParameterizedType(IntObjMap.class, dataClass);
        } else {
            mapType = null;
        }
    }

    public OVERVIEW_CLASS getOverview() {
        return RequestHelper.INSTANCE.getRequest(webTarget, overviewClass);
    }

    public DATA_CLASS get(int id) {
        return RequestHelper.INSTANCE.getRequest(webTarget.path(String.valueOf(id)), dataClass);
    }

    public DATA_CLASS get(int id, String language) {
        return RequestHelper.INSTANCE.getRequest(webTarget.path(String.valueOf(id)), dataClass, "lang", language);
    }

    public DATA_CLASS[] get(int[] ids) {
        return RequestHelper.INSTANCE.getRequest(webTarget, dataClassArray, "ids", DataUtil.intsToCommaSeparatedString(ids));
    }

    public IntObjMap<DATA_CLASS> getMap(int[] ids) {
        LibraryAvailabilityChecker.requireKoloboke();
        return RequestHelper.INSTANCE.getRequest(webTarget, mapType, "ids", DataUtil.intsToCommaSeparatedString(ids));
    }
    
    public IntObjMap<DATA_CLASS> getMap(int[] ids, String language) {
        LibraryAvailabilityChecker.requireKoloboke();
        return RequestHelper.INSTANCE.getRequest(webTarget, mapType, "ids", DataUtil.intsToCommaSeparatedString(ids), "lang", language);
    }

    public DATA_CLASS[] get(int[] ids, String language) {
        return RequestHelper.INSTANCE.getRequest(webTarget, dataClassArray, "ids", DataUtil.intsToCommaSeparatedString(ids), "lang", language);
    }

    public DATA_CLASS[] getAll() {
        return RequestHelper.INSTANCE.getRequest(webTarget, dataClassArray, "ids", "all");
    }

    public DATA_CLASS[] getAll(String language) {
        return RequestHelper.INSTANCE.getRequest(webTarget, dataClassArray, "ids", "all", "lang", language);
    }
}
