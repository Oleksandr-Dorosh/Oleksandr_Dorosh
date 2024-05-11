package oop.lesson15;

import oop.lesson17.weapon.MeleeWeapon;

public class Warrior<T extends MeleeWeapon> extends Hero<T> {
    public Warrior(String name, int damage) {
        super(damage, name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " вдарив мечем по " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
