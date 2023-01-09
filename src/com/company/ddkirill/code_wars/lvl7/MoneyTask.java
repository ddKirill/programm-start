package com.company.ddkirill.code_wars.lvl7;

public class MoneyTask {

    public static int calculateYears(double principal, double interest, double tax, double desired) {

        if (principal == desired) {
            return 0;
        } else {
            double currentMoney = principal;
            int amountYears = 0;
            while (currentMoney < desired) {
                double currentInterest = currentMoney * interest;
                double currentTax = currentInterest * tax;
                double currentRate = currentInterest - currentTax;
                currentMoney = currentMoney + currentRate;
                amountYears = amountYears + 1;
            }
            return amountYears;
        }
    }
}
