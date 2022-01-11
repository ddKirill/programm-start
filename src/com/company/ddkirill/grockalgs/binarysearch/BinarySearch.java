package com.company.ddkirill.grockalgs.binarysearch;



public class BinarySearch {


    public boolean search(int[] array, int find) {

        boolean result = false;

        int low = 0;
        int high = array.length - 1;


        while (!result) {

            if (low > high) {
                break;
            }
            //нашел индекс среднего элемента
            int midIndex = (low + high) / 2;


            //число среднего элемента
            int value = array[midIndex];

            //рассматриваем левую часть массива
            if (midIndex > find) {
                high = midIndex - 1;

                //рассматриваем правую часть массива
            } else if (midIndex < find) {

                low = midIndex + 1;
            } else {
                result = true;
            }




        }

        return result;



    }


}