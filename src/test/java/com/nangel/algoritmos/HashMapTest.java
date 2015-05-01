package com.nangel.algoritmos;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by nangel on 1/5/15.
 */
public class HashMapTest {
    @Test
    public void testCreate(){
        Map<MyKey,MyValue> repeatedValueMap = new HashMap<MyKey, MyValue>();
        assertNotNull(repeatedValueMap);
    }

    @Test
    public void testPut(){
        Map<MyKey,MyValue> repeatedValueMap = new HashMap<MyKey, MyValue>();
        MyKey key = new MyKey(1,2);
        MyKey key2 = new MyKey(2,3);

        MyValue value = new MyValue("name1",2);
        MyValue value2 = new MyValue("name2",2);
        repeatedValueMap.put(key,value);
        repeatedValueMap.put(key2, value2);
        assertEquals(2, repeatedValueMap.size());
    }

    @Test
    public void testPutSameValueDifferentKeys(){
        Map<MyKey,MyValue> repeatedValueMap = new HashMap<MyKey, MyValue>();
        MyKey key = new MyKey(1,2);
        MyKey key2 = new MyKey(2,3);

        MyValue value = new MyValue("name1",2);
        MyValue value2 = new MyValue("name1",2);
        repeatedValueMap.put(key,value);
        repeatedValueMap.put(key2,value2);
        assertEquals(2, repeatedValueMap.size());
    }
}
