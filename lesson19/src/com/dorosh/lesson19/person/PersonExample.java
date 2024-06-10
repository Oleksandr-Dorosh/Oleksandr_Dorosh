package com.dorosh.lesson19.person;

public class PersonExample {

    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Olegovich");
        Person mykola = new Person(29, "Mykola", "Igorovich");
        Person katya = new Person(3, " Katya" , "Oleksandrivna");

        System.out.println(ivan.hashCode());
        System.out.println(mykola.hashCode());
        System.out.println(ivan.equals(mykola));

    }
}
