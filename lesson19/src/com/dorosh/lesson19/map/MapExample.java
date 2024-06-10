package com.dorosh.lesson19.map;
import com.dorosh.lesson19.person.Person;
import java.util.HashMap;
import java.util.Map;
public class MapExample {
    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person mykola = new Person(2, "Mykola", "Igorovich");
        Person katya = new Person(1, "Katya", "Oleksandrivna");

        Map<Integer, Person> map = new HashMap<>();
        map.put(ivan.getId(), ivan);
        map.put(mykola.getId(), mykola);
        map.putIfAbsent(katya.getId(), katya);

//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        System.out.println(map.entrySet());
//
//        for (Person person : map.values()) {
//            System.out.println(person.getFirstName());
//        }
        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }
        System.out.println(map.containsKey(2));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.getOrDefault(2, katya));
    }
}

