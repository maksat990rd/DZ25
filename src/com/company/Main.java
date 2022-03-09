package com.company;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(List.of(0, 1, 2));
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(diff(set1, set2));
    }

    public static Set<Integer> diff(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> newSet = new HashSet<>(set1);
        newSet.removeAll(set2);
        set2.removeAll(set1);
        newSet.addAll(set2);

        return newSet;
    }
}
