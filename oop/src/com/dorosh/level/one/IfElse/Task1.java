package com.dorosh.level.one.IfElse;
// вивести пору року до якої відноситься місяць
public class Task1 {
    public static void main(String[] args) {
        int month = 4;
        // зима - 12,1,2
        // весна - 3,4,5
        // літо - 6,7,7
        // осінь - 9,10,11
        if (month == 12 || month == 1 || month == 2){
            System.out.println("Зима");
        }else if (month >= 3 && month <= 5){
            System.out.println("Весна");
        }else if (month >=6 && month <=8){
            System.out.println("Літо");
        }else if (month >= 9 && month <= 11){
            System.out.println("Осінь");
        } else {
            System.out.println("Місяць введено некоректно");
        }
    }
}
