package com.company.ddkirill.algs.task1;


import com.company.ddkirill.algs.utils.IOUtils;

public class Main {

    public static void main(String[] args) {


        BinarySearch instance = new BinarySearch();
        String arrayIn = IOUtils.readLineFromConsole(
                "Enter a sorted array to search and press \"Enter\" key.\nNote numbers must be divided by ','"
        );
        String findIn = IOUtils.readLineFromConsole(
                "Enter the desired number and press \"Enter\" key"
        );

        int[] arrayTransformed = IOUtils.readStringAsIntArray(arrayIn, ",");

        int findTransformed;
        try {
            findTransformed = Integer.parseInt(findIn);
        } catch (NumberFormatException nfe) {
            System.err.println("Illegal desired value: " + findIn);
            return;
        }

        boolean result = instance.search(arrayTransformed, findTransformed);
        System.out.println(result);
    }
}
