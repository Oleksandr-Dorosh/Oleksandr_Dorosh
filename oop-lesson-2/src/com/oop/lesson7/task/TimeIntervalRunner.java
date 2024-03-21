package com.oop.lesson7.task;

/**
 * Стоврити клас який описує проміжок часу. Сам проміжок часу повинен має 3 властивості:
 * секунди, хвилини, часи.
 * Створити метод для отримання повної кількості секунд в обєкті
 * Створити два конструктора: перший приймає загальну кількість секунд, другий -годинни,хвилини і секунди
 * по окремості.
 * Створити метод для виводу данних.
 */
public class TimeIntervalRunner {

    public static void main(String[] args) {
        TimeInterval timeInterval = createTimeInterval();

        TimeInterval timeInterval2 = new TimeInterval(timeInterval.totalSeconds());
        System.out.println(timeInterval2.totalSeconds());
        timeInterval2.print();

        TimeInterval sumIntervals = timeInterval.sum(timeInterval2);
        sumIntervals.print();
    }

    private static TimeInterval createTimeInterval() {
        TimeInterval timeInterval = new TimeInterval(30, 2, 1);
        System.out.println(timeInterval.totalSeconds());
        return timeInterval;
    }
}
