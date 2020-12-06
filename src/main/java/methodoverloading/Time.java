package methodoverloading;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Time(int hours) {
        this.hours = hours;
    }

    public Time(Time time) {
        hours = time.hours;
        minutes = time.minutes;
        seconds = time.seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean isEqual(Time time) {
        return time.hours == hours && time.minutes == minutes && time.seconds == seconds;
    }

    public boolean isEqual(int hours, int minutes, int seconds) {
        return this.hours == hours && this.minutes == minutes && this.seconds == seconds;
    }

    public boolean isEarlier(Time time) {
        return time.hours < hours ||
                time.hours == hours && time.minutes < minutes ||
                time.hours == hours && time.minutes == minutes && time.seconds < seconds;
    }

    public boolean isEarlier(int hours, int minutes, int seconds) {
        return this.hours < hours ||
                this.hours == hours && this.minutes < minutes ||
                this.hours == hours && this.minutes == minutes && this.seconds < seconds;
    }
}
