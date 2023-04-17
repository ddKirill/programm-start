package com.company.ddkirill.grockalgs.selectsort;

import java.util.Arrays;

public class SelectSort {

    public static void main(String[] args) {

        int[] array = {9, 7, 8, 5, 6, 3, 4, 2};

        for (int j = 0; j < array.length; j++) {
            System.out.println(Arrays.toString(array));
            int index = min(array, j);

            int tmp = array[j];
            array[j] = array[index];
            array[index] = tmp;
        }
    }

    private static int min(int[] array, int start){
        int minIndex = start;
        int minValue = array[start];

        for (int i = start + 1; i < array.length; i++){
            if (array[i] < minValue){
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;

    }
}




















