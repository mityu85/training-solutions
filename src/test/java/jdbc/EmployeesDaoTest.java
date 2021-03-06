package jdbc;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeesDaoTest {

    private EmployeesDao employeesDao;

    @BeforeEach
    public void init() {
        try {
            MariaDbDataSource dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
            dataSource.setUser("root");
            dataSource.setPassword("root");

            Flyway flyway = Flyway.configure().dataSource(dataSource).load();

            flyway.clean();
            flyway.migrate();

            employeesDao = new EmployeesDao(dataSource);
        }
        catch (SQLException se) {
            throw new IllegalStateException("Can not create data source", se);
        }
    }

    @Test
    public void testInsert() {
        employeesDao.createEmployee("John Doe");
        assertEquals(Arrays.asList("John Doe"), employeesDao.listEmployeeNames());
    }
}
