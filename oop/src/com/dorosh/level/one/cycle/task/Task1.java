package com.dorosh.level.one.cycle.task;

/**
 * Написати програму яка вираховує факторіал введеного цілого числа
 */
public class Task1 {
    // 1*2*3*4*5= 5!
    public static void main(String[] args) {
        int value = 4;
        int result = factorial(value);
        System.out.println(result);
    }

    public static int factorial(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i; //result = result * i;
        }
        return result;
    }
}
