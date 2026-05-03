package com.tpointtech.string;

import java.io.Serializable;

public final class MyString implements Serializable,
Comparable<MyString>{
    private final char[] a;

    public MyString(char[] a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return new String(a);
    }

    @Override
    public int compareTo(MyString o) {
        if (o == this)
            return 0;

        for (int i = 0; i < Math.min(this.a.length, o.a.length); i++) {
            if (a[i] != o.a[i])
                return a[i] - o.a[i];
        }

        return a.length - o.a.length;
    }
}
