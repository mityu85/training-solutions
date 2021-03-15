package covid;

import org.mariadb.jdbc.MariaDbDataSource;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;

public class VaccinationsDao {

    private MariaDbDataSource dataSource;

    public VaccinationsDao(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void generateListsOfVaccinatesToCsvGroupedByZip(Path path) {
       try (
               Connection conn = dataSource.getConnection();
               Statement stmt = conn.createStatement();
               ResultSet rs = stmt.executeQuery(
                       "select * from citizens");
               ) {

           LocalTime time = LocalTime.of(8, 0);

               try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(path, StandardOpenOption.APPEND))) {
                   pw.println("time; name; zip; age; email; taj");
                   for (int i = 0; i < 16; i++) {
                       pw.print(time);
                       pw.printf("%s;", rs.getString("citizten_name"));
                       pw.printf("%s;", rs.getString("zip"));
                       pw.printf("%d;", rs.getLong("age"));
                       pw.printf("%s;", rs.getString("email"));
                       pw.printf("%s;", rs.getString("taj"));
                       pw.println();
                       time.plusMinutes(30);
                   }
               } catch (IOException e) {
                   throw new IllegalStateException("File cannot read", e);
               }

       } catch (SQLException e) {
           throw new IllegalStateException("Cannot query", e);
       }
    }
}
