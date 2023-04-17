package com.company.ddkirill.grockalgs.quicksort_4;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args){

        int[] array = {3,1,4,1,5,9,2,6,5,3};
        int min = 1;
        int max = 9;
        quickSort(array,min,max);

        System.out.println("Initial array" + Arrays.toString(array));
    }

    public static void quickSort(int[] array, int min, int max){

        if (array.length == 0)
            return;
        if (min >= max)
            return;

        int midElement = (max - min) / 2;
        int pivot = array[midElement];

        int i = min;
        int j = max;

        while (i <= j){
            while (array[i] < pivot){
                i++;
            }

            while (array[j] > pivot){
                j--;
            }

            if (i <= j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (min < j)
            quickSort(array, min, j);

        if (max > i)
            quickSort(array, i, max);

        return;
    }


}
