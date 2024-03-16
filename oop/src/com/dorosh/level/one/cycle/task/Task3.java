package com.dorosh.level.one.cycle.task;

/**
 * В 1626 році індійці продали Манхеттен за 24$.
 * Написати програму яка вирахує суму яку б отримали індійці в цьому році якщо
 * б поклали на 5% річних у банк.
 */
public class Task3 {
    public static void main(String[] args) {
        double sourceSum = 1000;
        double result = sum(sourceSum);
        System.out.println(result);
    }

    public static double sum(double sourceSum){
        double result = sourceSum;
        for (int year = 1626 + 1; year <= 2024; year++) {
            double percent = result * 0.05;
            result += percent;
            System.out.println(year + " : " + result);
        }

        return result;
    }
}
