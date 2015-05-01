package com.nangel.algoritmos;

import com.sun.xml.internal.ws.util.QNameMap;

import java.util.*;

/**
 * Created by nangel on 1/5/15.
 */
public final class IntegerRepeatedValueMap<K,V> extends AbstractRepeatedValueMap<K,V,Integer>{

    public final Integer nextValue() {
        Integer integer = super.nextValue();
        if(integer!=null){
            return integer;
        }
        if(lastValue==null){
            return 1;
        }
        return lastValue+1;
    }

    @Override
    public final void clear() {
        super.clear();
        lastValue = 0;
    }

    public final int size() {
        return lastValue;
    }
}
