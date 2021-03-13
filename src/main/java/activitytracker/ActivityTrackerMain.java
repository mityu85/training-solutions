package activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityTrackerMain {

    public static void main(String[] args) {

        Activity biking = new Activity(LocalDateTime.of(2021, 1, 12, 15, 16, 12), "biking", Type.BIKING);
        Activity hiking = new Activity(LocalDateTime.of(2021, 2, 14, 9, 45, 6), "hiking", Type.HIKING);
        Activity running = new Activity(LocalDateTime.of(2021, 3, 1, 11, 38, 59), "running", Type.RUNNING);
        Activity basketball =new Activity(LocalDateTime.of(2021, 3, 6, 14, 52, 3), "basketball", Type.BASKETBALL);

        MariaDbDataSource dataSource = new MariaDbDataSource();
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot create datasource");
        }

        insertActivities(biking, dataSource);
        insertActivities(hiking, dataSource);
        insertActivities(running, dataSource);
        insertActivities(basketball, dataSource);

        System.out.println(getActivityById(20, dataSource));
        System.out.println(getActivityTable(dataSource));
        System.out.println(getActivityTable(dataSource).size());

    }

    public static long insertActivities(Activity activity, MariaDbDataSource dataSource) {
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

            return getIdByPreparedStatement(ps);
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot insert", e);
        }
    }

    public static Activity getActivityById(long id, MariaDbDataSource dataSource) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement("select * from activities where id = ?")
        ) {
            ps.setLong(1, id);

            return getActivityByPreparedStatement(ps);
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot find id", e);
        }
    }

    public static List<Activity> getActivityTable(MariaDbDataSource dataSource) {
        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from activities");
                ) {
            List<Activity> activities = new ArrayList<>();
            while (rs.next()) {
                activities.add(getActivityById(rs.getLong(1), dataSource));
            }
            return activities;
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot query", e);
        }
    }

    private static long getIdByPreparedStatement(PreparedStatement ps) {
        try (ResultSet rs = ps.getGeneratedKeys()) {
            if (rs.next()) {
                return rs.getLong(1);
            }
            throw new IllegalStateException("Cannot get id");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot get id", e);
        }
    }

    private static Activity getActivityByPreparedStatement(PreparedStatement ps) {
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                return new Activity(rs.getLong(1), rs.getTimestamp("start_time").toLocalDateTime(),
                        rs.getString("activity_desc"), Type.valueOf(rs.getString("activity_type")));
            }
            throw new IllegalStateException("Cannot found");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot query", e);
        }
    }

}
