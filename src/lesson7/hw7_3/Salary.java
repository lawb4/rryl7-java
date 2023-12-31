package lesson7.hw7_3;

import lesson7.hw7_2.Employee;

public class Salary {

    // recommended to use `static` because there is no need of class instantiation
    static double getSum(Employee[] employeeArray) {
        double sum = 0;
        for (Employee emp : employeeArray) {
            sum += emp.getSalary();
        }
        return sum;
    }
}
