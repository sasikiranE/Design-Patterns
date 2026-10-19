package behavioral.memento;

public class CheckpointSystem {

    private PlayerState checkpoint;

    public void saveCheckpoint(Player player) {
        this.checkpoint = player.createPlayerState();
    }

    public void loadCheckpoint(Player player) {
        if (this.checkpoint != null) {
            player.loadPlayerState(checkpoint);
        }
    }

}
