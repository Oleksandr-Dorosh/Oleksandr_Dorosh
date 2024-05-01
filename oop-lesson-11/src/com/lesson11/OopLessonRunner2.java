package com.lesson11;

public class OopLessonRunner2 {

    public static void main(String[] args) {
        Computer laptop = new Laptop(new Ssd(512), new Ram(16), 3);
        Computer mobile = new Mobile(new Ssd(64), new Ram(4));

        printWithRandom(laptop, mobile);
    }

    public static void print(Printable... objects) {
        for (Printable object : objects) {
            object.print();
            System.out.println();
        }
    }

    public static void printWithRandom(Printable... objects) {
        for (Printable object : objects) {
            object.printWithRandom();
            System.out.println();
        }
    }
}
