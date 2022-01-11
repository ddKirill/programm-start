package com.company.ddkirill.other_algs_and_data_structure.fibonaccinumbers;

public class FibonacciNumbers {

    public static void main(String[] args){

        System.out.println(Fibonacci(3));
        System.out.println(Fibonacci(5));
        System.out.println(Fibonacci(10));
        System.out.println(FibonacciEffective(100));


    }
        //Простой вариант, очень долго работает
    private static long Fibonacci(int n){

        if (n <= 1)
            return n;

            return Fibonacci(n-1) + Fibonacci(n -2);


    }

    private static long FibonacciEffective(int n) {

        long[] array = new long[n + 1];

        array[0] = 0;

        array[1] = 1;
        for (int i = 2; i <= n; i++)
            array[i] = array[i - 1] + array[i - 2];

            return array[n];


    }


}
