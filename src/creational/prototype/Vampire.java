package creational.prototype;

public class Vampire implements Enemy {

    private int health;
    private int attackDamage;

    public Vampire(int health, int attackDamage) {
        this.health = health;
        this.attackDamage = attackDamage;
    }

    private Vampire(Vampire other) {
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
        return new Vampire(this);
    }
}
