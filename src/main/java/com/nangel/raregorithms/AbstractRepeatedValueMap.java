package com.nangel.raregorithms;

import java.util.*;

/**
 * Created by nangel on 1/5/15.
 */
public abstract class AbstractRepeatedValueMap<K,V,N> implements RepeatedValueMap<K,V,N>{
    private final Map<K,N> keys = new HashMap<K, N>();
    private final Map<N,V> values = new HashMap<N, V>();
    protected N lastValue;
    Stack<N> freePositions = new Stack<N>();

    public boolean isEmpty() {
        return keys.isEmpty();
    }

    public boolean containsKey(Object key) {
        return keys.containsKey(key);
    }

    public boolean containsValue(Object value) {
        return values.containsValue(value);
    }

    public V get(Object key) {
        N integer = keys.get(key);
        if(integer!=null){
            return values.get(integer);
        }
        return null;
    }

    private N nextValue() {
        if(!freePositions.isEmpty()){
            return freePositions.pop();
        }
        return internalNextValue();
    }

    protected abstract N internalNextValue();

    public V put(final K key,final V value){
        N mappingKey = nextValue();
        V valueFound = null;
        for(Entry<N,V> valueN : values.entrySet()){
            V valueOnMap = valueN.getValue();
            if(valueOnMap.equals(value)){
                mappingKey = valueN.getKey();
                valueFound = valueOnMap;
                break;
            }
        }
        keys.put(key,mappingKey);
        if(valueFound==null){
            valueFound = values.put(mappingKey,value);
            lastValue = mappingKey;
        }
        return valueFound;
    }

    public V remove(Object key) {
        N remove = keys.remove(key);
        if(remove!=null){
            for(N i : keys.values()){
                if(i.equals(remove)){
                    return values.get(i);
                }
            }
            freePositions.push(remove);
            return values.remove(remove);
        }
        return null;
    }

    public void putAll(Map<? extends K, ? extends V> m) {
        for(Entry<? extends K, ? extends V> next : m.entrySet()){
            put(next.getKey(),next.getValue());
        }
    }

    public final void clear() {
        keys.clear();
        values.clear();
        internalClear();
    }

    protected abstract void internalClear();

    public Set<K> keySet() {
        return keys.keySet();
    }

    public Collection<V> values() {
        return values.values();
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K,V>> entrySet = new HashSet<Entry<K, V>>();
        for(Entry<K,N> key : keys.entrySet()){
            K k = key.getKey();
            V v = values.get(key.getValue());
            entrySet.add(new AbstractMap.SimpleImmutableEntry<K, V>(k,v));
        }
        return entrySet;
    }

    public List<K> getKeys(V value) {
        N index = null;
        for(Entry<N,V> valueN : values.entrySet()){
            if(valueN.getValue().equals(value)){
                index = valueN.getKey();
                break;
            }
        }
        List<K> keysToReturn = new ArrayList<K>();
        if(index!=null){
            for(Entry<K,N> keyN : keys.entrySet()){
                if(keyN.getValue().equals(index)){
                    keysToReturn.add(keyN.getKey());
                }
            }
        }
        return keysToReturn;
    }
}
