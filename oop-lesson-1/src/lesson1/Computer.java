package lesson1;

public class Computer {
    int ssd = 500;
    int ram;

    Computer() {
        System.out.println("Я був створений");
    }

    Computer(int newSsd) {
        ssd = newSsd;
    }

    Computer(int newSsd, int newRam) {
        ssd = newSsd;
        ram = newRam;
    }

    void load() {
        System.out.println("Я загрузився");
    }

    void printState() {
        System.out.println("Ssd: " + ssd);
        System.out.println("Ram: " + ram);
        System.out.println();
    }
}
