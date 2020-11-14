package employee;

public class Employee {

    private String name;
    private String job;
    private int salary;

    public Employee(String name, String job, int salary) {
        if (isEmpty()) {
            throw new IllegalArgumentException("isEmpty!");
        }
        if (salary % 1000 != 0) {
            throw new IllegalArgumentException("Salary must be divide by 1000!");
        }
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getSalary() {
        return salary;
    }

    private boolean isEmpty() {
        if (name == "" || job == "" || Integer.toString(salary) == "") {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return name + " - " + job + " - " + salary + " Ft";
    }
}
