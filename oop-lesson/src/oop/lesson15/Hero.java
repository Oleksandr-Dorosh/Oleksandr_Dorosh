package oop.lesson15;

import oop.lesson17.weapon.Weapon;

public abstract class Hero<T extends Weapon> {

    private int damage;
    private String name;
    private T weapon;

    public Hero(int damage, String name) {
        this.damage = damage;
        this.name = name;
    }

    public abstract void attackEnemy(Enemy enemy);

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }
}
