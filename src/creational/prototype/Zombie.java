package creational.prototype;

public class Zombie implements Enemy {

    private int health;
    private int attackDamage;

    public Zombie(int health, int attackDamage) {
        this.health = health;
        this.attackDamage = attackDamage;
        // in practice we would have a lot more fields.
    }

    private Zombie(Zombie other) {
        this.health = other.health;
        this.attackDamage = other.attackDamage;
    }

    @Override
    public void attack() {

    }

    @Override
    public void move() {

    }

    @Override
    public Enemy copy() {
        return new Zombie(this);
    }
}
