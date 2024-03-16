package com.dorosh.level.one.IfElse;

/**
 * 4.Написати програму яка считує рік, введений користувачем, і оприділяє, чи являється
 * цей рік високосним.
 * Рік являється високосним якщо він ділиться без залишку на 4. Але, якщо рік також ділиться на 100,
 * то цей рік не високосний, за виключенням тих які діляться на 400.
 * Наприклад:
 * 1992- Yes
 * 1900 - NO
 * 2000- Yes
 */
public class Task4 {
    public static void main(String[] args) {
        int year = 2025;
        isLeapYear(year);
    }

    public static void isLeapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " високосний");
        } else {
            System.out.println(year + " не високосний");
        }
    }
}
