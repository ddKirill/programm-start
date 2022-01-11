package com.company.ddkirill.other_algs_and_data_structure.maxvalue;

public class MaxValueInArray {

    public static void main(String[] args){

        Integer[] array = {9,7,8,5,6,3,4,2};

        int maxValue = array[0];
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++){
            if (array[i] > maxValue){
                maxValue = array[i];
                maxIndex = 1;
            }
        }

        System.out.println(maxIndex);
        System.out.println(maxValue);
    }
}
