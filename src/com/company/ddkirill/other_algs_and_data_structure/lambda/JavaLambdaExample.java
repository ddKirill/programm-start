package com.company.ddkirill.other_algs_and_data_structure.lambda;

public class JavaLambdaExample {

    public static void main(String[] args) {

        OperationableInterface operationableInterface;
        String simpleLambda = "This is simple lambda function result = ";
        operationableInterface = (x,y) -> x+y;
        int result = operationableInterface.getSum(30,30);
        System.out.println(simpleLambda + result);


    }


}
