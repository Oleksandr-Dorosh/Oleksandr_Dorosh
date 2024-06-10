package com.dorosh.lesson19.map;

import com.dorosh.lesson19.person.Person;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Olegovich");
        Person mykola = new Person(29, "Mykola", "Igorovich");
        Person katya = new Person(3, " Katya" , "Oleksandrivna");

        Map<Integer, Person> map = new LinkedHashMap<>();
        map.put(ivan.getId(), ivan);
        map.put(mykola.getId(), mykola);
        map.putIfAbsent(katya.getId(), katya);

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
