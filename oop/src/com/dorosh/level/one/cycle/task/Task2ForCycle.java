package com.dorosh.level.one.cycle.task;

public class Task2ForCycle {
    public static void main(String[] args) {
        int value = 12345;
        int result = sumFor(value);
        System.out.println(result);
    }

    public static int sumFor(int value) {
        int result = 0;
        for (int currentValue = value; currentValue != 0 ; currentValue /= 10) {
            result += currentValue % 10;
        }
        return result;
    }
}
