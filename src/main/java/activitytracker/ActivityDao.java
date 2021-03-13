package activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
                        Statement.RETURN_GENERATED_KEYS)
                ) {
            ps.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            ps.setString(2, activity.getDesc());
            ps.setString(3, activity.getType().name());
            ps.executeUpdate();

            return getActivityByGeneratedKeys(ps);
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot insert", e);
        }
    }

    public Activity findActivityById(long id) {
        try ( Connection conn = dataSource.getConnection();
              PreparedStatement ps = conn.prepareStatement("select * from activities where id = ?")
        ) {
            ps.setLong(1, id);
            return getActivityByPreparedStatement(ps);
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

    private Activity getActivityByGeneratedKeys(PreparedStatement ps) {
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
                return new Activity(rs.getLong(1), rs.getTimestamp(2).toLocalDateTime(),
                        rs.getString("activity_desc"), Type.valueOf(rs.getString("activity_type")));
            }
            throw new IllegalStateException("Cannot query");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot query", e);
        }
    }
}
