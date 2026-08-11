package com.tpointtech.collections.sets.hashset;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class HashSetDemo {
    static void main() {

        HashSet<Integer> set = new HashSet<>(16, 0.75f);
        set.add(1);
        System.out.println(set.add(2));

        set.clear();

        set.add(1);
        Object clone = set.clone();
        System.out.println(clone);

        System.out.println(set.contains(2));
        System.out.println(set.isEmpty());

        System.out.println(set.iterator());

        System.out.println(set.remove(1));

        System.out.println(set.size());

        set.addAll(List.of(1, 2, 3, 4, 5));
        System.out.println(set.remove(1));
        System.out.println(set.removeIf(e -> e % 2 == 0));
        System.out.println(set.removeAll(List.of(4, 5, 6)));
        System.out.println(set);

        Objects.equals(1, 1);

    }
}
