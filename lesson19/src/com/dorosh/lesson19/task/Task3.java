package com.dorosh.lesson19.task;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Написати метод isUnique, який приймає Map&lt;String, String&gt;
 * і повертає true,
 * якщо кожному ключу відповідають своє унікальне значення.
 * Наприклад, у цьому випадку повернеться true:
 * {Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp,
 * Hal = Perkins}
 * А в даному false:
 * {Kendrick = Perkins, Stuart = Reges, Jessica = Miller, Bruce = Reges,
 * Hal = Perkins}
 */
public class Task3 {

    public static void main(String[] args) {
        Map<String, String> map = Map.of(
                "Marty", "Stepp",
                "Stuart", "Reges",
                "Jessica", "Miller",
                "Amanda", "Camp",
                "Hal", "Perkins"
        );

        System.out.println(isUnique(map));
    }

    public static boolean isUnique(Map<String, String> map) {
        return map.size() == new HashSet<>(map.values()).size();
    }
}
