package com.dorosh.level.one.recursion;

/**
 * Написати програму яка вираховує факторіал введеного цілого числа
 */
public class RecursionExample {
    public static void main(String[] args) {
//        1*2*3*4*5*6=6!
        int factorial = factorial(6);
        System.out.println(factorial);
    }

    public static int factorial(int value) {
        if (value == 1) {
            return 1;
        }
//      6 * (5 * (4 * (3 * (2 * 1))))
        return value * factorial(value - 1);
    }
}
