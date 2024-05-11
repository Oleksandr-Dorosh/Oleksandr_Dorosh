package oop.lesson15;

import oop.lesson17.weapon.MagicWeapon;

public class Mage<T extends MagicWeapon> extends Hero<T> {
    public Mage(String name, int damage) {
        super(damage, name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " створив заклинання проти " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
