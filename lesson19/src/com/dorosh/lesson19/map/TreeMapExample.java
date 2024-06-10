package com.dorosh.lesson19.map;

import com.dorosh.lesson19.person.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person mykola = new Person(29, "Mykola", "Igorovich");
        Person katya = new Person(3, "Katya", "Oleksandrivna");
        Person katya1 = new Person(30, "Katya1", "Oleksandrivna1");
        Person katya2 = new Person(45, "Katya2", "Oleksandrivna2");
        Person katya3 = new Person(10, "Katya3", "Oleksandrivna3");


        Map<Integer, Person> map = new TreeMap<>();
        map.put(ivan.getId(), ivan);
        map.put(mykola.getId(), mykola);
        map.putIfAbsent(katya.getId(), katya);
        map.putIfAbsent(katya1.getId(), katya1);
        map.putIfAbsent(katya2.getId(), katya2);
        map.putIfAbsent(katya3.getId(), katya3);

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
            
        }

    }
}
