package com.nangel.algoritmos;

import java.util.Map;

/**
 * Created by nangel on 1/5/15.
 */
public interface RepeatedValueMap<K,V,N> extends Map<K,V> {
    N nextValue();
}
