package com.nangel.raregorithms;

import java.util.List;
import java.util.Map;

/**
 * Created by nangel on 1/5/15.
 */
public interface RepeatedValueMap<K,V,N> extends Map<K,V> {
    public List<K> getKeys(V value);
}
