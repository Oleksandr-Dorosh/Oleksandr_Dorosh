package com.dorosh.level.one.cycle.task;

/**
 * Написати програму , яка проходить циклом по англ. алфавіту
 * починаючи з букви 'b', і виводить кожну букву до тих пір,
 * поки не зустріне голосну
 */
public class Task5 {
    public static void main(String[] args) {
        printLetters();
    }

    public static void printLetters() {
        for (char letter = 'b'; !isVowel(letter); letter++) {
            System.out.println(letter);
        }
    }

    public static boolean isVowel(char value) {
        return value == 'a' || value == 'e' || value == 'y' || value == 'u' || value == 'i' || value == 'o';
    }
}
