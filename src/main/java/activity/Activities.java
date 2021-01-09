package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {

    private List<Activity> activities;

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public List<Report> distancesByTypes() {
        List<Report> reports = new ArrayList<>();
        double biking = 0.0;
        double hiking = 0.0;
        double running = 0.0;
        double basketBall = 0.0;
        for (Activity activity: activities) {
            if (activity.getType().equals(ActivityType.BIKING)) {
                biking += activity.getDistance();
            }
            if (activity.getType().equals(ActivityType.HIKING)) {
                hiking += activity.getDistance();
            }
            if (activity.getType().equals(ActivityType.RUNNING)) {
                running += activity.getDistance();
            }
            if (activity.getType().equals(ActivityType.BASKETBALL)) {
                basketBall += activity.getDistance();
            }
        }
        reports.add(new Report(ActivityType.BIKING, biking));
        reports.add(new Report(ActivityType.HIKING, hiking));
        reports.add(new Report(ActivityType.RUNNING, running));
        reports.add(new Report(ActivityType.BASKETBALL, basketBall));
        return reports;
    }

    public int numberOfTrackActivities() {
        int sum = 0;
        for (Activity activity: activities) {
            if (!activity.getType().equals(ActivityType.BASKETBALL)) {
                sum++;
            }
        }
        return sum;
    }

    public int numberOfWithoutTrackActivities() {
            int sum = 0;
            for (Activity activity: activities) {
                if (activity.getType().equals(ActivityType.BASKETBALL)) {
                    sum++;
                }
            }
            return sum;
    }
}
