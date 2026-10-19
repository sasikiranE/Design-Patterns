package behavioral.iterator;

import java.util.NoSuchElementException;

public class ListIterator implements Iterator<Song> {

    private int currIndex = -1;
    private final Playlist playlist;

    ListIterator(Playlist playlist) {
        this.playlist = playlist;
    }

    @Override
    public boolean hasNext() {
        return currIndex + 1 < playlist.size();
    }

    @Override
    public Song next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more items");
        }
        currIndex++;
        return playlist.getSongAt(currIndex);
    }
}
