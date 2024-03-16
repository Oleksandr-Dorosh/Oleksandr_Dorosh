package com.dorosh.level.one.function;
/**
 * Написати функцію яка приймає 2 ціло чисельних параметри, і повертає найбільше з них
 */
public class FunctionTask2 {
    public static void main(String[] args) {
        int value1 = 5;
        int value2= 10;
        int result = getMax(value1, value2);
        System.out.println(result);
    }

    public static int getMax(int firstValue, int secondValue){
        if (firstValue > secondValue){
            return firstValue;
        }
        return secondValue;
    }
}
