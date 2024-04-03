package com.oop.lesson10;

/**
 * 2. Написати функцію, яка приймає 2 параметри: строку і слово -
 * і поевертаючу true, якщо строка починається і закінчується цим словом.
 */
public class Task2 {
    public static void main(String[] args) {
        String value = "123 fwefwf wefwef 123";
        String word = "123";
        System.out.println(isStartAndEnd(value,word));
    }

    private static boolean isStartAndEnd(String target, String word) {
        return target.startsWith(word) && target.endsWith(word);
    }
}
