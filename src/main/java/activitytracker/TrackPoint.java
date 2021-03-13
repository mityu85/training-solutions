package activitytracker;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TrackPoint {

    private long id;
    private LocalDateTime time;
    private double lat;
    private double lon;
    private long activity_id;

    public TrackPoint(LocalDateTime time, double lat, double lon) {
        this.time = time;
        this.lat = lat;
        this.lon = lon;
    }

    public TrackPoint(LocalDateTime time, double lat, double lon, long activity_id) {
        this(time, lat, lon);
        this.activity_id = activity_id;
    }
    public TrackPoint(long id, LocalDateTime time, double lat, double lon) {
        this(time, lat, lon);
        this.id = id;
    }

    public TrackPoint(long id, LocalDateTime time, double lat, double lon, long activity_id) {
        this(id, time, lat, lon);
        this.activity_id = activity_id;
    }

    public long getId() {
        return id;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public long getActivity_id() {
        return activity_id;
    }
}
