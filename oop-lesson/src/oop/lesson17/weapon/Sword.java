package oop.lesson17.weapon;

import oop.lesson17.weapon.MeleeWeapon;

public class Sword implements MeleeWeapon {
    @Override
    public int getDamage() {
        return 15;
    }
}
