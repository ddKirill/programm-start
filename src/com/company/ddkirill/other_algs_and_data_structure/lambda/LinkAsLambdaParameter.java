package com.company.ddkirill.other_algs_and_data_structure.lambda;

public class LinkAsLambdaParameter {

    interface ExpressionExample {
        boolean isEqual(int i);
    }

    static class ExpressionHelper {

        boolean isEven(int n) {

            return n % 2 == 0;
        }
    }

        public static void main(String[] args) {

            int[] nums = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
            ExpressionHelper exprHelper = new ExpressionHelper();
            System.out.println(sum(nums, exprHelper::isEven)); // 0
        }

        private static int sum(int[] numbers, ExpressionExample func) {
            int result = 0;
            for (int i : numbers) {
                if (func.isEqual(i))
                    result += i;
            }
            return result;
        }

}
