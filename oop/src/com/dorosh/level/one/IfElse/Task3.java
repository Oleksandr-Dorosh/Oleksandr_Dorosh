package com.dorosh.level.one.IfElse;

/**
 * 3.Існує ціле число, введене користувачем з консолі. Це число- сумма грошей в гривнях.
 * Вивести це число, добавивши до нього слово "гривня" в правильному відмінку ("гривня","гривень","гривні")
 */
public class Task3 {
    public static void main(String[] args) {
        int griven = 1234;
        // 1 гривня !11
        // 5,6,7,8,9,10,11... гривень
        // 2,3,4 гривні
        if ((griven % 10 == 1) && (griven % 100 != 11)){
            System.out.println(griven + " гривня");
        }else if ((griven % 10 == 2 || griven % 10 == 3 || griven % 10 == 4)
                && !(griven % 100 == 12 || griven % 100 == 13 || griven % 100 == 14)){
            System.out.println(griven + " гривні");
        }else {
            System.out.println(griven + " гривень");
        }
    }
}
