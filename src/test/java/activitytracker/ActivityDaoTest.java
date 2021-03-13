package activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Array;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActivityDaoTest {

    private ActivityDao activityDao;

    Activity biking = new Activity(LocalDateTime.of(2021, 1, 12, 15, 16, 12), "biking", Type.BIKING);
    Activity hiking = new Activity(LocalDateTime.of(2021, 2, 14, 9, 45, 6), "hiking", Type.HIKING);
    Activity running = new Activity(LocalDateTime.of(2021, 3, 1, 11, 38, 59), "running", Type.RUNNING);
    Activity basketball =new Activity(LocalDateTime.of(2021, 3, 6, 14, 52, 3), "basketball", Type.BASKETBALL);

    @BeforeEach
    public void init(){
        MariaDbDataSource dataSource = new MariaDbDataSource();

        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("root");
            dataSource.setPassword("root");

            Flyway flyway = Flyway.configure().dataSource(dataSource).load();

            flyway.clean();
            flyway.migrate();

            activityDao = new ActivityDao(dataSource);
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot create datasource", e);
        }
    }

    @Test
    public void testSaveActivity() {
        activityDao.saveActivity(biking);
        assertEquals(1, activityDao.listActivities().size());
    }

    @Test
    public void testFindActivityById() {
        activityDao.saveActivity(biking);
        activityDao.saveActivity(hiking);
        activityDao.saveActivity(running);
        activityDao.saveActivity(basketball);

        assertEquals(activityDao.listActivities().get(3).getType(), activityDao.findActivityById(4).getType());
    }

    @Test
    public void testListActivities() {
        activityDao.saveActivity(biking);
        activityDao.saveActivity(hiking);
        activityDao.saveActivity(running);
        activityDao.saveActivity(basketball);

        assertEquals(4, activityDao.listActivities().size());
    }
}
