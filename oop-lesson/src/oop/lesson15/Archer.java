package oop.lesson15;

import oop.lesson17.weapon.RangeWeapon;

public class Archer<T extends RangeWeapon> extends Hero<T> {

    private Wolf wolf;
    public Archer(String name, int damage) {
        super(damage, name);
        this.wolf = new Wolf("Wolf", 7);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " вистрілив з лука в " + enemy.getName());
        wolf.attackEnemy(enemy);
    }

    public class Wolf {
        private String name;
        private int damage;

        public Wolf(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        public void attackEnemy(Enemy enemy){
            System.out.println(name + " і " + Archer.this.getName() + " спільно наносять шкоду");
            enemy.takeDamage(damage + Archer.this.getDamage());
        }
    }
}
