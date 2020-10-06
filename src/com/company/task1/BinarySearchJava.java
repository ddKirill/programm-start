package com.company.task1;

public class BinarySearchJava {

    public boolean search(int[] array, int find) {

        boolean result = false;

        int from = 0;
        int end = array.length - 1;

        while (!result) {

            if (from > end) {
                break;
            }
            //индекс среднего элемента
            int midElement = end - (end - from) / 2;
            //средний элемент
            int midValue = array[midElement];

            if (midValue > find) {
                end = midElement - 1;


            } else if (midValue < find) {
                from = midElement + 1;
            } else {
                result = true;
            }
        }
        return result;
    }

    public boolean dumbSearch(int[] array, int find) {

        for (int a : array) {
            if (a == find) {
                return true;
            }
        }
        return false;
    }
}

