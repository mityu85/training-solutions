package exceptionclass.course;

public class SimpleTime {

    private int hour;
    private int minutes;
    private String time;

    public SimpleTime(int hour, int minutes) {
        if (hour < 0 || hour > 23) {
            throw new InvalidTimeException("Hour is invalid (0-23)", hour);
        }
        if (minutes < 0 || minutes > 59) {
            throw new InvalidTimeException("Minute is invalid (0-59)", minutes);
        }
        this.hour = hour;
        this.minutes = minutes;
    }

    public SimpleTime(String time) {
        int hh = Integer.parseInt(time.substring(0, 2));
        int mm = Integer.parseInt(time.substring(3, 5));
        if (time == null) {
            throw new InvalidTimeException("Time is null", time);
        }
        if ( (hh < 0 || hh > 23) || (mm < 0 || mm > 59) ) {
            throw new InvalidTimeException("Time is not hh:mm", time);
        }
        hour = hh;
        minutes = mm;
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return hour + ":" + minutes;
    }
}
