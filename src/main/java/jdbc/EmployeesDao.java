package jdbc;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeesDao {

    private DataSource dataSource;

    public EmployeesDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public long createEmployee(String name) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("insert into employees(emp_name) values (?)",
                        Statement.RETURN_GENERATED_KEYS)
                ) {
            stmt.setString(1, name);
            stmt.executeUpdate();

            return getIdByStatement(stmt);
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot insert", e);
        }
    }

    private long getIdByStatement(PreparedStatement stmt) {
        try (
                ResultSet rs = stmt.getGeneratedKeys()
                ) {
            if (rs.next()) {
                return rs.getLong(1);
            }
            throw new IllegalStateException("Cannot get id");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot get id", e);
        }
    }

    public List<String> listEmployeeNames() {
        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select emp_name from employees");
                ) {
            List<String> names = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("emp_name");
                names.add(name);
            }
            return names;
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot select employees", e);
        }
    }

    public String findEmployeeNameById(long id) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement("select emp_name from employees where id = ?");
                ) {
            ps.setLong(1, id);

            return getStringStmt(ps);
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot query", e);
        }
    }

    private String getStringStmt(PreparedStatement ps) {
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                return rs.getString("emp_name");
            }
            throw new IllegalStateException("Not found");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot query", e);
        }
    }
}
