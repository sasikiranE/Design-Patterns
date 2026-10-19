import behavioral.iterator.Iterator;
import behavioral.iterator.Playlist;
import behavioral.iterator.Song;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.add(new Song("abc", "efg", 150));
        playlist.add(new Song("dude", "sai", 320));

        Iterator<Song> iterator = playlist.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}