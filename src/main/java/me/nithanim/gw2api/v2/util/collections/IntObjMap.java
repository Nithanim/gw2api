package me.nithanim.gw2api.v2.util.collections;

import com.koloboke.compile.KolobokeMap;
import java.util.Map;


@KolobokeMap
@SuppressWarnings(value = { "all" , "unsafe" , "deprecation" , "overloads" , "rawtypes" })
public abstract class IntObjMap<T> implements Map<Integer, T>, com.koloboke.collect.map.IntObjMap<T> {
    public static <T> IntObjMap<T> withExpectedSize(int expectedSize) {
        return new KolobokeIntObjMap<T>(expectedSize);
    }
}
