package lesson7.hw7_2;

import java.math.BigDecimal;

public class Employee {
    String name;
    int age;
    boolean sex;
    private double salary; // add `private` to comply with OOP conventions

    public boolean isSameName(Employee employee) {
        return this.name.equalsIgnoreCase(employee.name);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
