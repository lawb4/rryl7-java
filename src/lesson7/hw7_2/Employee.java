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
        if (salary < 0) {
            this.salary = 0;
        } else {
            this.salary = salary;
        }
        // 2nd variant : return value closer to positive infinity
        //this.salary = Math.max(salary, 0);
    }

    public double getSalary() {
        return salary;
    }
}
