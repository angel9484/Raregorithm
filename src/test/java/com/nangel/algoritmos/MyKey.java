package com.nangel.algoritmos;

/**
 * Created by nangel on 1/5/15.
 */
public class MyKey {
    private int id1;
    private int id2;

    public MyKey(final int id1, final int id2) {
        this.id1 = id1;
        this.id2 = id2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyKey myKey = (MyKey) o;

        if (id1 != myKey.id1) return false;
        return id2 == myKey.id2;

    }

    @Override
    public int hashCode() {
        int result = id1;
        result = 31 * result + id2;
        return result;
    }
}
