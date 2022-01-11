package com.company.ddkirill.other_algs_and_data_structure.minvalue;

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
