package com.dorosh.level.one.IfElse;

public class IfElseExample {
    public static void main(String[] args) {
        int value = 0;
//        boolean test = value > 0;
        if (value > 0){
            System.out.println("Число быльше нуля");
        } else if(value < 0){
            System.out.println("Число менше нуля");
        } else {
            System.out.println("Число дорівнює нулю");
        }
    }
}
