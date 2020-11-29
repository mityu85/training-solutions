package week05d05;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private List<Song> songs;

    public Playlist(List<Song> songs) {
        this.songs = songs;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public List<Song> findByLengthGreaterThan(int mins) {
        List<Song> resultSongs = new ArrayList<>();
        for (Song song: songs) {
            if (song.getLengthInSeconds() > mins * 60) {
                resultSongs.add(song);
            }
        }
        return resultSongs;
    }

    public String toString() {
        return songs.toString();
    }
}
