package com.company.ddkirill.algs.task2;

public class SelectSort {

    public static void selectIntSort(int array[]){

        int min, tmp;

        for (int i = 0; i < array.length; i++){
            min = i;
            for (int scan = i + 1; scan < array.length; scan ++){
                if (array[scan] < array [min]){
                    min = scan;
                }
                tmp = array[min];
                array[min] = array[i];
                array[i] = tmp;
            }
        }

    }
}


