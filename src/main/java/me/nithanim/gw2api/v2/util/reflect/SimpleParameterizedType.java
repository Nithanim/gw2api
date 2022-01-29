package me.nithanim.gw2api.v2.util.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class SimpleParameterizedType implements ParameterizedType {
  Type baseType;
  Type genericType;

  public SimpleParameterizedType(Type baseType, Type genericType) {
    this.baseType = baseType;
    this.genericType = genericType;
  }

  @Override
  public Type[] getActualTypeArguments() {
    return new Type[] {genericType};
  }

  @Override
  public Type getRawType() {
    return baseType;
  }

  @Override
  public Type getOwnerType() {
    return null;
  }
}
