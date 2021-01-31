package week13d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TemplateMerger {

    private List<Employee> employees = new ArrayList<>();

    public String merge(Path file, List<Employee> employees) {
        String str = "";
        fillUpEmployeeFromFile(file);
        for (Employee emp: employees) {
            str += "Az alkalmazott neve:" + emp.getName()
                        + ", születési éve: " + emp.getBirthYear() + "\n";
        }
        return str;
    }

    private void fillUpEmployeeFromFile(Path file) {
        List<String> strings;
        try {
            strings = Files.readAllLines(file);
            for (String str: strings) {
                String[] temp = str.split(",");
                employees.add(new Employee(temp[0].substring(22), Integer.parseInt(temp[1].substring(17))));
            }
        } catch (IOException e) {
            throw new IllegalStateException("File can not read", e);
        }
    }
}
