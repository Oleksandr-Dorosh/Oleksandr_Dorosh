package com.lesson11;

public class OopLessonRunner {

    public static void main(String[] args) {
        Computer laptop = new Laptop(new Ssd(512), new Ram(16), 3);
        Computer mobile = new Mobile(new Ssd(64), new Ram(4));

       Laptop laptop1 = new Laptop(new Ssd(5000), new Ram(1000), 5);

//        loadComputers(laptop, mobile);
        printInformation(new Computer[]{laptop, mobile, laptop1});
    }

    public static void printInformation(Computer[] computers) {
        for (Computer computer : computers) {
            computer.print();
            if (computer instanceof Laptop) {
                Laptop laptop = (Laptop) computer;
                laptop.open();
            }
            System.out.println();
        }
    }

    public static void loadComputers(Computer... computers) {
        for (Computer computer : computers) {
            computer.load();
            System.out.println();
        }
    }
}
