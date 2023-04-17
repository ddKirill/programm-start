package com.company.ddkirill.grockalgs.quicksort_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter int item");
        Scanner scanner = new Scanner(System.in);
        int integer1 = scanner.nextInt();
        System.out.println("Enter int item");
        int integer2 = scanner.nextInt();
        System.out.println("Enter int item");
        int integer3 = scanner.nextInt();
        System.out.println("Enter int item");
        int integer4 = scanner.nextInt();
        System.out.println("Enter int item");
        int integer5 = scanner.nextInt();

        List<Integer> integerList = new ArrayList<>();
        integerList.add(integer1);
        integerList.add(integer2);
        integerList.add(integer3);
        integerList.add(integer4);
        integerList.add(integer5);

        MultiplicationTable multiplicationTable = new MultiplicationTable();
        multiplicationTable.logic(integerList);
        System.out.println(integerList);
        System.out.println(multiplicationTable.getMultiplicationTable());
    }
}
