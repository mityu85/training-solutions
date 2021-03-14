package activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActivityDao {

    MariaDbDataSource dataSource;

    public ActivityDao(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Activity saveActivity(Activity activity) {
        try(
                Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement(
                        "insert into activities(start_time, activity_desc, activity_type) values (?, ?, ?)",
                        Statement.RETURN_GENERATED_KEYS);
                ) {
            ps.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            ps.setString(2, activity.getDesc());
            ps.setString(3, activity.getType().name());
            ps.executeUpdate();

            return getActivityIdByGeneratedKeys(ps);

        } catch (SQLException e) {
            throw new IllegalStateException("Cannot insert", e);
        }
    }

    public void saveActivityWithTrackPoints(Activity activity, List<TrackPoint> trackPoints) {
        try(
                Connection conn = dataSource.getConnection();
                ) {
            conn.setAutoCommit(false);
            long activity_id = saveActivity(activity).getId();

            try(
                    PreparedStatement ps = conn.prepareStatement(
                            "insert into trackpoints(trackpoint_time, lat, lon, activity_id) values (?, ?, ?, ?)")
                    ) {

                for (TrackPoint trackPoint: trackPoints) {
                    if (trackPoint.getLon() > 180 || trackPoint.getLon() < -180 ||
                    trackPoint.getLat() > 90 || trackPoint.getLat() < -90) {
                        throw new IllegalArgumentException("Invalid coordinates");
                    }

                    ps.setTimestamp(1, Timestamp.valueOf(trackPoint.getTime()));
                    ps.setDouble(2, trackPoint.getLat());
                    ps.setDouble(3, trackPoint.getLon());
                    ps.setLong(4, activity_id);

                    ps.executeUpdate();
                }
                conn.commit();
            } catch (IllegalArgumentException iae) {
                conn.rollback();
            }

        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect", e);
        }
    }

    public Activity findActivityById(long id) {
        try(
                Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement("select * from activities where id = ?")
        ) {
            ps.setLong(1, id);

            return getActivityByPreparedStatement(ps);

        } catch (SQLException e) {
            throw new IllegalStateException("Cannot query", e);
        }
    }

    public Map<Activity, List<TrackPoint>> findActivityAndTrackPointById(long id) {
        Map m = new HashMap();
        try(
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from activities right join (trackpoints) on (activities.id = trackpoints.activity_id)")
        ) {
            List<TrackPoint> trackPoints = new ArrayList<>();
            while (rs.next()) {
                trackPoints.add(new TrackPoint(rs.getLong(5), rs.getTimestamp("trackpoint_time").toLocalDateTime(),
                        rs.getDouble("lat"), rs.getDouble("lon"), rs.getLong("activity_id")));
            }
            if (!trackPoints.isEmpty()) {
                m.put(findActivityById(id), trackPoints);
            }
            return m;
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot query", e);
        }
    }

    public List<Activity> listActivities() {
        try(
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from activities")
                ) {
            List<Activity> activities = new ArrayList<>();
            while (rs.next()) {
                activities.add(findActivityById(rs.getLong(1)));
            }
            return activities;
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot query", e);
        }
    }

    private Activity getActivityIdByGeneratedKeys(PreparedStatement ps) {
        try(ResultSet rs = ps.getGeneratedKeys()) {
            if (rs.next()) {
                long id = rs.getLong(1);
                return findActivityById(id);
            }
            throw new IllegalStateException("Cannot query");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot query", e);
        }
    }

    private Activity getActivityByPreparedStatement(PreparedStatement ps) {
        try(ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                return new Activity(rs.getLong(1), rs.getTimestamp("start_time").toLocalDateTime(),
                        rs.getString("activity_desc"), Type.valueOf(rs.getString("activity_type")));
            }
            throw new IllegalStateException("Cannot query");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot query", e);
        }
    }
}
