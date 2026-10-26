import structural.adapter.MP3Player;
import structural.adapter.MediaPlayer;
import structural.adapter.Mp4PlayerAdapter;
import structural.adapter.mp4lib.MP4Player;

public class Main {
    public static void main(String[] args) {
        MediaPlayer mp3Player = new MP3Player();
        mp3Player.play("dude.mp3");
        MediaPlayer mp4Player = new Mp4PlayerAdapter(new MP4Player());
        mp4Player.play("king.mp4");
    }
}