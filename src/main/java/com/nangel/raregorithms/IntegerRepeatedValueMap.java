package com.nangel.raregorithms;

/**
 * Created by nangel on 1/5/15.
 */
public final class IntegerRepeatedValueMap<K,V> extends AbstractRepeatedValueMap<K,V,Integer>{

    @Override
    protected final Integer internalNextValue() {
        if(lastValue==null){
            return 1;
        }
        return lastValue+1;
    }

    @Override
    public final void internalClear() {
        lastValue = 0;
    }

    public final int size() {
        return lastValue;
    }
}
