package com.company.ddkirill.grockalgs.recursion_3;

public class Countdown {


    public static void main(String[] args) {

        Countdown countdown = new Countdown();
        countdown.countDown(5);

    }

    Integer countDown(int i) {
        System.out.println(i);
        if (i <= 1) {
            return 0;
        } else {
           return countDown(i - 1);
        }

    }

}
