package oop.lesson15;

public class TrainingGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Knight", 15);
        Hero mage = new Mage("Io", 20);
        Archer archer = new Archer("Drow ranger", 10);

        Archer.Wolf wolf = archer.new Wolf("Second Wolf", 11);

        Enemy enemy = new Enemy("Zombie", 100);

        attackEnemy(enemy, warrior, mage, archer);
    }

    public static void attackEnemy(Enemy enemy, Hero... heroes) {
        while (enemy.isAlive()) {
            for (Hero hero : heroes) {
                if (enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                }
            }
        }
    }
}
