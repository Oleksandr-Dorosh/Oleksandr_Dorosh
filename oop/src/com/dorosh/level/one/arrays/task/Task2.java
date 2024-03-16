package com.dorosh.level.one.arrays.task;

/**
 * Написати програму, яка вносить у масив перші 100 цілих чисел, які діляться на 13 чи на 17 і друкує його
 */
public class Task2 {
    public static void main(String[] args) {
        int[] values = new int[100];
        fillArray(values);
        Task1.printArray(values);
    }

    public static void fillArray(int[] values){
        int currentIndex = 0;
        for (int currentValue = 1; currentIndex < values.length; currentValue++) {
            if (currentValue % 13 == 0 || currentValue % 17 == 0){
                values[currentIndex] = currentValue;
                currentIndex++;
            }
        }
    }
}
