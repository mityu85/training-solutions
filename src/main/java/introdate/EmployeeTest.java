package introdate;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {

        System.out.println("Name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Year of birth:");
        int year = sc.nextInt();
        sc.nextLine();

        System.out.println("Month of birth:");
        int month = sc.nextInt();
        sc.nextLine();

        System.out.println("Day of birth:");
        int day = sc.nextInt();
        sc.nextLine();

        Employee emp = new Employee(year, month, day, name);
        System.out.println(emp.getName() + " was born: " + emp.getDateOfBirth());
        System.out.println("Begin employment: " + emp.getBeginEmployment());
    }
}
