package lesson7.hw7_2;

import java.math.BigDecimal;

public class Employee {
    String name;
    int age;
    boolean sex;
    double salary;

    public boolean isSameName(Employee employee) {
        return this.name.equals(employee.name);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
