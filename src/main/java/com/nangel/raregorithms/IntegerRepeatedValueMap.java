package com.nangel.raregorithms;

public final class IntegerRepeatedValueMap<K,V> extends AbstractRepeatedValueMap<K,V,Integer>{

    @Override
    protected final Integer internalNextValue() {
        if(lastValue==null){
            return 1;
        }
        return lastValue+1;
    }

    @Override
    protected final void internalClear() {
        lastValue = 0;
    }

    public final int size() {
        return lastValue + super.size();
    }
}
