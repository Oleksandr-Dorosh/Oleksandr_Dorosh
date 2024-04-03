package com.oop.lesson10;

/**
 * Написати функцію, яка приймає ПІБ в якості параметрів, і повертає ініціали
 * в форматі П.І.Б. Врахувати, що вхідні параметри можуть бути в любому регістрі, а результативна в верхньому.
 */
public class Task3 {

    public static void main(String[] args) {
        String result = format("Oleksandr", "Dorosh", "Ivanovich");
        System.out.println(result);
    }

    public static String format(String firstName, String lastName, String patronymicName) {
        char firstNameChar = Character.toUpperCase(firstName.charAt(0));
        char lastNameNameChar = Character.toUpperCase(lastName.charAt(0));
        char patronymicNameChar = Character.toUpperCase(patronymicName.charAt(0));

        return String.format("%s.%s.%s", firstNameChar, lastNameNameChar, patronymicNameChar);
    }
}
