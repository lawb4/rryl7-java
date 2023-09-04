package lesson7.hw7_3;

import lesson7.hw7_2.Employee;

public class Salary {

    public double getSum(Employee[] employeeArray) {
        double sum = 0;
        for (Employee emp : employeeArray) {
            sum += emp.getSalary();
        }
        return sum;
    }
}
