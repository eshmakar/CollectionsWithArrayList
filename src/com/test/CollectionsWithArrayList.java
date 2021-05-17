package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionsWithArrayList {
    public static void main(String[] args) {
        Collection<Integer> co = new ArrayList<>();
        Integer a[] = {1, 2, 3, 4, 5};
        Collections.addAll(co, a); //так с помощью Collections можно добавлять массивы сразу
        System.out.println(co);

        //ТАК ТОЖЕ МОЖНО ДОБАВЛЯТЬ
        Collection<Integer> col = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
        Integer a2[] = {11, 12, 13, 14, 15};
        System.out.println(col);
    }
}