package com.company.ddkirill.other_algs_and_data_structure.lambda;

import java.util.Scanner;
import java.util.function.*;

public class BuiltFunctionalInterfaces {

    public static void main(String[] args) {

        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println("Is positive");
        System.out.println(isPositive.test(3));
        System.out.println(isPositive.test(-9));

        UnaryOperator<Integer> unaryOperator = (x) -> x * 5;
        System.out.println("Unary operator");
        System.out.println(unaryOperator.apply(3));

        Function<Integer, String> functionPlus= (x) -> x + " dollars";
        System.out.println("functionInterface");
        System.out.println(functionPlus.apply(5));

        Consumer<Integer> printer = x-> System.out.printf("%d долларов \n", x);
        printer.accept(600);

        Supplier<User> userFactory = ()->{

            Scanner in = new Scanner(System.in);
            System.out.println("Введите имя: ");
            String name = in.nextLine();
            return new User(name);
        };

        User user1 = userFactory.get();
        User user2 = userFactory.get();

        System.out.println("Имя user1: " + user1.getName());
        System.out.println("Имя user2: " + user2.getName());
    }

    }

    class User{

        private final String name;
        String getName(){
            return name;
        }

        User(String n){
            this.name=n;
        }
    }


