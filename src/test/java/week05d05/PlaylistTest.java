package week05d05;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PlaylistTest {

    @Test
    public void throwIllegalArgumentTest() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Song("It's my life",
                                                                                    320,
                                                                                    ""));
        assertEquals("name or artist is empty", ex.getMessage());
    }

    @Test
    public void throwIllegalArgumentTest2() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Song("",
                                                                                    320,
                                                                                    "Dr. Alban"));
        assertEquals("name or artist is empty", ex.getMessage());
    }

    @Test
    public void greaterThanTest() {
        List<Song> songs = new ArrayList<>(Arrays.asList(
                new Song("It's my life", 320, "Dr. Alban"),
                new Song("Get Rich or Try Dying", 180, "50 Cent")));
        Playlist playlist = new Playlist(songs);
        assertEquals(1, playlist.findByLengthGreaterThan(4).size());
    }
}
