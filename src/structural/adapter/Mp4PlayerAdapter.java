package structural.adapter;

import structural.adapter.mp4lib.MP4Player;

public class Mp4PlayerAdapter implements MediaPlayer {
    private final MP4Player mp4Player;

    public Mp4PlayerAdapter(MP4Player mp4Player) {
        this.mp4Player = mp4Player;
    }

    @Override
    public void play(String filename) {
        this.mp4Player.playMp4(filename);
    }
}
