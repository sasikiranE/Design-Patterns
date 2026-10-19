package behavioral.memento;

public class Player {
    private int healthPoints;
    private int cash;

    public Player(int healthPoints, int cash) {
        this.healthPoints = healthPoints;
        this.cash = cash;
    }

    public void takeDamage(int damage) {
        this.healthPoints = Math.max(0, this.healthPoints - damage);
    }

    public void spendCash(int cashSpent) {
        this.cash = Math.max(0, this.cash - cashSpent);
    }

    public PlayerState createPlayerState() {
        return new PlayerState(this.healthPoints, this.cash);
    }

    public void loadPlayerState(PlayerState playerState) {
        this.healthPoints = playerState.getHealthPoints();
        this.cash = playerState.getCash();
    }

    @Override
    public String toString() {
        return "Player{" +
                "healthPoints=" + healthPoints +
                ", cash=" + cash +
                '}';
    }

}
