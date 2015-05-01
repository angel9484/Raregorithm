package com.nangel.raregorithms;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by nangel on 1/5/15.
 */
public class IntegerRepeatedValueMapTest {

    @Test
    public void testCreate(){
        IntegerRepeatedValueMap<MyKey,MyValue> integerRepeatedValueMap = new IntegerRepeatedValueMap<MyKey, MyValue>();
        assertNotNull(integerRepeatedValueMap);
    }

    @Test
    public void testPut(){
        IntegerRepeatedValueMap<MyKey,MyValue> integerRepeatedValueMap = new IntegerRepeatedValueMap<MyKey, MyValue>();
        MyKey key = new MyKey(1,2);
        MyKey key2 = new MyKey(2,3);

        MyValue value = new MyValue(1,2);
        MyValue value2 = new MyValue(2,2);
        integerRepeatedValueMap.put(key,value);
        integerRepeatedValueMap.put(key2, value2);
        assertEquals(2, integerRepeatedValueMap.size());
    }

    @Test
    public void testPutSameValueDifferentKeys(){
        IntegerRepeatedValueMap<MyKey,MyValue> integerRepeatedValueMap = new IntegerRepeatedValueMap<MyKey, MyValue>();
        MyKey key = new MyKey(1,2);
        MyKey key2 = new MyKey(2,3);

        MyValue value = new MyValue(1,2);
        MyValue value2 = new MyValue(1,2);
        integerRepeatedValueMap.put(key,value);
        integerRepeatedValueMap.put(key2,value2);
        assertEquals(1, integerRepeatedValueMap.size());
    }

    @Test
    public void testGetKeys(){
        IntegerRepeatedValueMap<MyKey,MyValue> integerRepeatedValueMap = new IntegerRepeatedValueMap<MyKey, MyValue>();
        MyKey key = new MyKey(1,2);
        MyKey key2 = new MyKey(2,3);

        MyValue value = new MyValue(1,2);
        MyValue value2 = new MyValue(1,2);
        integerRepeatedValueMap.put(key,value);
        integerRepeatedValueMap.put(key2,value2);
        List<MyKey> keys = integerRepeatedValueMap.getKeys(value);
        assertEquals(2,keys.size());
    }
}
