package covid;

import org.mariadb.jdbc.MariaDbDataSource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CitiesDao {

    private MariaDbDataSource dataSource;

    public CitiesDao(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void uploadFromCsv() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(CitiesDao.class.getResourceAsStream("cities.csv")))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(";");
                if (!(temp[0].equals("IRSZ") && temp[1].equals("Település"))) {
                    try (
                            Connection conn = dataSource.getConnection();
                            PreparedStatement ps = conn.prepareStatement(
                                    "insert into cities(zip, city) values (?, ?)")
                    ) {
                        ps.setString(1, temp[0]);
                        ps.setString(2, temp[1]);
                        ps.executeUpdate();
                    } catch (SQLException e) {
                        throw new IllegalStateException("cannot insert", e);
                    }
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("File cannot read", e);
        }
    }
}
