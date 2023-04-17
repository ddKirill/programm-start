package com.company.ddkirill.grockalgs.quicksort_4;

import java.util.LinkedList;

public class MinimalValue {

    public static void main(String[] args){

        Integer[] array = {9,7,8,5,6,3,4,2};

        int minValue = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++){
            if (array[i] < minValue){
                minValue = array[i];
                minIndex = 1;
            }
        }
        System.out.println(minValue);
    }

}
