package com.dorosh.lesson19.task;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Написати метод countUnique, який приймає цілочисельний список
 * в якості параметра і повертає кількість унікальних цілих чисел в цьому списку.
 * При отримані пустого списку метож повинен повертати 0.
 * Приклад:
 * [3, 7, 3, -1, 2, 3, 7, 2, 15, 15] - поверне 5.
 */
public class Task2 {

    public static void main(String[] args) {
        List<Integer> integers = List.of(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
        System.out.println(countUnique(integers));
    }

    private static int countUnique(List<Integer> list) {
        return new HashSet<>(list).size();
    }
}
