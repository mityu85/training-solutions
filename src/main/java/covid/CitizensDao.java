package covid;

import org.mariadb.jdbc.MariaDbDataSource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CitizensDao {

    private MariaDbDataSource dataSource;

    public CitizensDao(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void uploadFromCsv() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(CitizensDao.class.getResourceAsStream("citizens.csv")))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(";");
                if (!temp[0].equals("name")) {
                    try (
                            Connection conn = dataSource.getConnection();
                            PreparedStatement ps = conn.prepareStatement(
                                    "insert into citizens(citizen_name, zip, age, email, taj) values (?, ?, ?, ?, ?)");
                            ) {
                        ps.setString(1, temp[0]);
                        ps.setString(2, temp[1]);
                        ps.setLong(3, Integer.parseInt(temp[2]));
                        ps.setString(4, temp[3]);
                        ps.setString(5, temp[4]);
                        ps.executeUpdate();
                    } catch (SQLException e) {
                        throw new IllegalStateException("Cannot insert", e);
                    }
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("File cannot read", e);
        }
    }
}
