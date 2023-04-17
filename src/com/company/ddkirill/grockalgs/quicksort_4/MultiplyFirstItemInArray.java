package com.company.ddkirill.grockalgs.quicksort_4;

import java.util.ArrayList;
import java.util.List;

public class MultiplyFirstItemInArray {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        integerList.add(10);
        integerList.add(20);
        integerList.add(30);

        Integer firstItem = integerList.get(0);
        Integer firstItemX2 = firstItem * 2;
        integerList.remove(0);
        integerList.add(0, firstItemX2);

        System.out.println(integerList);
    }
}
