package me.nithanim.gw2api.v2.util.gson;

import com.google.gson.InstanceCreator;
import java.lang.reflect.Type;
import java.util.EnumMap;

public class EnumMapInstanceCreator<K extends Enum<K>, V> implements InstanceCreator<EnumMap<K, V>> {
    private final Class<K> enumClass;

    public EnumMapInstanceCreator(Class<K> enumClass) {
        this.enumClass = enumClass;
    }
    
    @Override
    public EnumMap<K, V> createInstance(Type type) {
        return new EnumMap<>(enumClass);
    }
}
