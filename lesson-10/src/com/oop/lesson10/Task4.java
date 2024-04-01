package com.oop.lesson10;

/**
 * Підрахувати кількість всіх крапок, ком, і знаків оклику в стрічці.
 */
public class Task4 {

    public static void main(String[] args) {
        String value = "asdaf.,!asdf.,!asf";
        System.out.println(countSymbols(value));
    }

    public static int countSymbols(String value) {
        String result = value.replace(".", "")
                .replace(",", "")
                .replace("!", "");
        return value.length() - result.length();
    }
}
