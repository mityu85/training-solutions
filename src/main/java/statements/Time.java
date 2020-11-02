package statements;

public class Time {
    private int h;
    private int m;
    private int s;

    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public int getInMinutes() {
        return h*60 + m;
    }

    public int getInSeconds() {
        return h*60*60 + m*60 + s;
    }

    public boolean earlierThan(Time time) {
        return this.getInSeconds() < time.getInSeconds();
    }

    public String toString() {
        return h + ":" + m + ":" + s;
    }
}
