package com.nangel.algoritmos;

/**
 * Created by nangel on 1/5/15.
 */
public class MyValue {
    private String name;
    private int age;

    public MyValue() {

    }

    public MyValue(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyValue myValue = (MyValue) o;

        if (age != myValue.age) return false;
        return !(name != null ? !name.equals(myValue.name) : myValue.name != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
