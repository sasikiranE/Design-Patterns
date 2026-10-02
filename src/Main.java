import creational.prototype.Enemy;
import creational.prototype.Vampire;
import creational.prototype.Zombie;

public class Main {
    public static void main(String[] args) {
        Enemy vampirePrototype = new Vampire(100, 20);
        Enemy zombiePrototype = new Zombie(150, 10);

        Enemy enemy1 = vampirePrototype.copy();
        Enemy enemy2 = vampirePrototype.copy();
        Enemy enemy3 = zombiePrototype.copy();
        Enemy enemy4 = zombiePrototype.copy();
    }
}