package debug.employees;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Employee> employees;

    public Company(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee findEmployeeByName(String name){
        for (Employee index: employees) {
            if (index.getName().equals(name)) {
                return index;
            }
        }
        return null;
    }

    public List<String> listEmployeeNames() {
        List<String> names = new ArrayList<>();
        for (Employee index: employees) {
            names.add(index.getName());
        }
        return names;
    }
}

