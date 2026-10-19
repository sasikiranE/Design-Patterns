import behavioral.memento.CheckpointSystem;
import behavioral.memento.Player;

public class Main {
    public static void main(String[] args) {
        Player player = new Player(100, 100);
        CheckpointSystem checkpointSystem = new CheckpointSystem();
        System.out.println(player);
        checkpointSystem.saveCheckpoint(player);
        player.takeDamage(50);
        player.spendCash(20);
        System.out.println(player);
        checkpointSystem.loadCheckpoint(player);
        System.out.println(player);
    }
}