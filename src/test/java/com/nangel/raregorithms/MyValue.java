package com.nangel.raregorithms;

/**
 * Created by nangel on 1/5/15.
 */
public class MyValue {
    private int name;
    private int age;

    public MyValue() {

    }

    public MyValue(int name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyValue myValue = (MyValue) o;

        if (name != myValue.name) return false;
        return age == myValue.age;

    }

    @Override
    public int hashCode() {
        int result = name;
        result = 31 * result + age;
        return result;
    }
}
