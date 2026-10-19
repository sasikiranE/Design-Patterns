package behavioral.iterator;

/*
Implement the Iterator Pattern in Java so clients can traverse a playlist without knowing how its songs are stored.

Requirements
    1. Create a Song class with fields such as title, artist, and duration.
    2. Create a Playlist class that stores songs internally. Choose the storage structure yourself.
    3. Create an Iterator<Song> interface with methods to check for the next song and retrieve it.
    4. Implement a concrete iterator for the playlist.
    5. The playlist should provide a method that creates and returns an iterator.
    6. Write a Main class that adds at least four songs and plays through them using the iterator.
 */

import java.util.ArrayList;

public class Playlist {
    private final ArrayList<Song> songs = new ArrayList<>();

    public void add(Song song) {
        songs.add(song);
    }

    public Iterator<Song> createIterator() {
        return new ListIterator(this);
    }

    public Song getSongAt(int index) {
        return songs.get(index);
    }

    public int size() {
        return songs.size();
    }
}
