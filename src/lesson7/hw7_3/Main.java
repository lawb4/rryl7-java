package lesson7.hw7_3;

/*Необходимо создать класс Salary
с единственным методом - getSum(Employee[] employeeArray),
метод должен возвращать сумму зарплат всех сотрудников
из массива переданного в качестве аргумента вызова метода.*/

import lesson7.hw7_2.Employee;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setSalary(150.5);
        Employee emp2 = new Employee();
        emp2.setSalary(200.0);
        Employee emp3 = new Employee();
        emp3.setSalary(376.673);

        Employee[] employeesArray = {emp1, emp2, emp3};

        // can use `getSum` without instantiation because it is `static`
        System.out.println(Salary.getSum(employeesArray));
    }
}
