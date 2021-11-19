package com.company.ddkirill.algs.selectsort;

import java.util.Arrays;

public class SelectSort {

    public static void main(String[] args){

        int[] array = {2,4,1,3,5,7,6,9,8};

        System.out.println(numbersForDigits(array));
    }

    public static String numbersForDigits(int[] array){

        Arrays.sort(array);

        String result = "";
        for (int i = array.length - 1; i>=0; i--)
            result += array[i];

        return result;

    }






}


