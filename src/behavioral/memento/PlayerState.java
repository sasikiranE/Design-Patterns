package behavioral.memento;

public class PlayerState {
    private final int healthPoints;
    private final int cash;

    public PlayerState(int healthPoints, int cash) {
        this.healthPoints = healthPoints;
        this.cash = cash;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getCash() {
        return cash;
    }

}
