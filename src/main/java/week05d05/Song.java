package week05d05;

public class Song {

    private String name;
    private long lengthInSeconds;
    private String artist;


    private boolean isEmpty(String str) {
        return (str == null || str.isEmpty() || "".equals(str.trim()));
    }

    public Song(String name, long lengthInSeconds, String artist) {
        if (isEmpty(name) || isEmpty(artist)) {
            throw new IllegalArgumentException("name or artist is empty");
        }
        if (lengthInSeconds >= 0) {
            this.lengthInSeconds = lengthInSeconds;
        }
        this.name = name;
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public long getLengthInSeconds() {
        return lengthInSeconds;
    }

    public String getArtist() {
        return artist;
    }

    public String toString() {
        return name + " " + lengthInSeconds + " sec " + artist;
    }
}
