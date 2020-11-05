package debug.employees;

import java.util.ArrayList;

public class CompanyMain {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Teszt Elek", 1985);
        Employee employee2 = new Employee("John Doe", 1981);
        Employee employee3 = new Employee("Jaen Doe", 1990);
        Company company = new Company(new ArrayList<>());

        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addEmployee(employee3);
        System.out.println(company.listEmployeeNames());

        Employee john = company.findEmployeeByName("John Doe");
        System.out.println(john.getName() + " " + john.getYearOfBirth());

    }
}
