package me.nithanim.gw2api.v2.util.reflect;

import lombok.experimental.UtilityClass;
import me.nithanim.gw2api.v2.util.collections.IntObjMap;

@UtilityClass
public class LibraryAvailabilityChecker {
    private static final boolean kolobokeAvailable;
    
    static {
        boolean _kolobokeAvailable;
        try {
            //this is an attempt to stop jit from removing the call
            _kolobokeAvailable = IntObjMap.class != null;
        } catch(NoClassDefFoundError e) {
            _kolobokeAvailable = false;
        }
        kolobokeAvailable = _kolobokeAvailable;
    }
    
    public static boolean checkKoloboke() {
        return kolobokeAvailable;
    }
    
    public static void requireKoloboke() {
        if(!checkKoloboke()) {
            throw new RequiredLibraryNotFoundException("Koloboke");
        }
    }
}
