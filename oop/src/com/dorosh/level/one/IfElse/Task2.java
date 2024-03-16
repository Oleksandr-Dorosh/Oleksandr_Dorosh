package com.dorosh.level.one.IfElse;

/**
 * 2.Дано ціле число. Визначит, чи являється остання цифра цього числа - цифрою 3.
 */
public class Task2 {
    public static void main(String[] args) {
        int value = 912313;
        int testValue = value % 10;
        if (testValue == 3){
            System.out.println("Остання цифра числа є 3");
        }
    }
}
