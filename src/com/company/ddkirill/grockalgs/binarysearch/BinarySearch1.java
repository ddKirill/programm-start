package com.company.ddkirill.grockalgs.binarysearch;

public class BinarySearch1 {


    public static void main(String[] args){

        System.out.println(binarySearch2(new int[] {1,2,3,4,5,6,7,8,12}, 7));


    }

    public static int binarySearch2(int[] arr, int findIndex){

        int min = 0;
        int max = arr.length - 1;

        while (min <= max){

            int midIndex = (min + max) /2;
            int midValue = arr[midIndex];

            if (findIndex > midIndex){
               min = midIndex + 1; 
            
            } else if (findIndex < midIndex){
                max = midIndex -1;
            } else {
                return midValue;
            }
        }
        return -1;
    }



}
