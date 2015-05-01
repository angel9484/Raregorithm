package com.nangel.raregorithms;

import java.util.List;
import java.util.Map;

public interface RepeatedValueMap<K,V,N> extends Map<K,V> {
    List<K> getKeys(V value);
}
