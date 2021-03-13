package activitytracker;

import java.time.LocalDateTime;
import java.util.List;

public class Activity {

    private long id;
    private LocalDateTime startTime;
    private String desc;
    private Type type;
    private List<TrackPoint> trackPoints;

    public Activity(LocalDateTime startTime, String desc, Type type) {
        this.startTime = startTime;
        this.desc = desc;
        this.type = type;
    }

    public Activity(long id, LocalDateTime startTime, String desc, Type type) {
        this(startTime, desc, type);
        this.id = id;
    }

    public Activity(long id, LocalDateTime startTime, String desc, Type type, List<TrackPoint> trackPoints) {
        this.id = id;
        this.startTime = startTime;
        this.desc = desc;
        this.type = type;
        this.trackPoints = trackPoints;
    }

    public long getId() {
        return id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public String getDesc() {
        return desc;
    }

    public Type getType() {
        return type;
    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", desc='" + desc + '\'' +
                ", type=" + type +
                '}';
    }
}
