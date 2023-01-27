package com.company.ddkirill.other_algs_and_data_structure.thread;

public class ExampleThread extends Thread {


        ExampleThread(String name){
            super(name);
        }

        public void run(){

            System.out.printf("%s started... \n", Thread.currentThread().getName());
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println("Thread has been interrupted");
            }
            System.out.printf("%s fiished... \n", Thread.currentThread().getName());
        }
    }

    class Main {

        public static void main(String[] args) {

            System.out.println("Main thread started...");
            for (int i = 1; i < 6; i++) {
                new ExampleThread("ExampleThread").start();
                System.out.println("Main thread finished...");
            }
        }
    }





