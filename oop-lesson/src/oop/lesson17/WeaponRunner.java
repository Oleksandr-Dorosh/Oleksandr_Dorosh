package oop.lesson17;

import oop.lesson15.Archer;
import oop.lesson15.Hero;
import oop.lesson15.Warrior;
import oop.lesson17.weapon.Bow;
import oop.lesson17.weapon.Sword;
import oop.lesson17.weapon.Weapon;

public class WeaponRunner {
    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<>("Drow Ranger", 15);
        archer.setWeapon(new Bow());

        Warrior<Sword> warrior = new Warrior<>("Knight", 10);
        warrior.setWeapon(new Sword());

        printWeaponDamage(warrior);
    }

    public static void printWeaponDamage(Hero<Sword> hero) {
        Sword weapon = hero.getWeapon();
        hero.setWeapon(new Sword());
        System.out.println(hero.getWeapon().getDamage());
    }
}
