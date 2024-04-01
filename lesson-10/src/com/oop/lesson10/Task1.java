package com.oop.lesson10;

/**
 * 1.Замінити всі сумні смайлики :(  в стрічках на веселі :)
 */
public class Task1 {
    public static void main(String[] args) {
        String value = " hello :) world :( my name :( is :) ";
        String result = replace(value);
        System.out.println(result);
    }

    public static String replace(String value) {
        return value.replace(":(", ":)");
    }
}
