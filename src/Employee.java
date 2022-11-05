import java.util.Objects;

public class Employee {

    private static int counter = 0;
    private final String FullName;
    private int department;
    private double salary;
    private final int id;

    public Employee(String FullName, int department, double salary) {
        id = counter++;
        this.FullName = FullName;
        this.department = department;
        this.salary = salary;
    }

    public String getFullName() {
        return this.FullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "ФИО работника: " + FullName + ", отдел: " + department + ", зарплата сотрудника: " + salary + ", id сотрудника: " + id;
    }
}

