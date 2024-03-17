package com.dorosh.level.one.cycle.task;

/**
 * Існує число. Порахувати суму цифр данного числа.
 */
public class Task2 {
    public static void main(String[] args) {
        int value = 12345;
        int result = sum(value);
        System.out.println(result);
    }

    public static int sum(int value) {
        int result = 0;
        int currentValue = value;
        while (currentValue != 0) {
            result += currentValue % 10;
            currentValue /= 10;
        }
        return result;
    }
}
