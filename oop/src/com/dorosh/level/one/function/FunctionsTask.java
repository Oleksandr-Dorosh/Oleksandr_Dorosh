package com.dorosh.level.one.function;

public class FunctionsTask {
    public static void main(String[] args){
        int value = 2000;
        isLeapYear(value);
    }

    public static boolean isLeapYear(int year){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
