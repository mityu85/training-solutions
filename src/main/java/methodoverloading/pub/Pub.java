package methodoverloading.pub;

import methodoverloading.Time;

public class Pub {

    private String name;
    private Time time;

    public Pub(String name, int hours, int minutes) {
        this.name = name;
        time = new Time(hours, minutes);
    }

    public String getName() {
        return name;
    }

    public Time getTime() {
        return time;
    }

    public String toString() {
        return name + " - Open from: " + time.getHours() + ":" + time.getMinutes();
    }
}
