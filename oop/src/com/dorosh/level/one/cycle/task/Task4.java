package com.dorosh.level.one.cycle.task;

/**
 * Написати програму яка визначає чи є введене ціле число простим, тобто ділиться без залишку тільки
 * на 1 і само на себе.
 */
public class Task4 {
    public static void main(String[] args) {
        int value = 3;
        boolean result = isSimple(value);
        System.out.println(result);
    }

    public static boolean isSimple(int value) {
        boolean result = true;
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
