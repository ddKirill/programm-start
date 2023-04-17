package com.company.ddkirill.grockalgs.quicksort_4;


/*
        4.8 Создание таблицы умножения для всех элементов массива.
        Например, если массив состоит из элементов [2 , 3, 7, 8, 10], сначала каждый элемент умножается на 2,
         затем каждый элемент умножается на 3, затем на 7 и т. д.

        В данном классе мы будем умножать элементы на 2,3,5!
     */

import java.util.ArrayList;
import java.util.List;

public class MultiplicationTable {

    private List<List<Integer>> multiplicationTable = new ArrayList<>();

    public MultiplicationTable() {
    }

    public void logic(List<Integer> integerList) {
        for (Integer integer : integerList) {
            int integerX2 = integer * 2;
            int integerX3 = integer * 3;
            int integerX5 = integer * 5;
            List<Integer> oneArray = new ArrayList<>();
            oneArray.add(integerX2);
            oneArray.add(integerX3);
            oneArray.add(integerX5);
            multiplicationTable.add(oneArray);
        }
    }

    public List<List<Integer>> getMultiplicationTable() {
        return multiplicationTable;
    }

}
