package oop.lesson17.weapon;

import oop.lesson17.weapon.RangeWeapon;

public class Bow implements RangeWeapon {
    @Override
    public int getDamage() {
        return 10;
    }
}
