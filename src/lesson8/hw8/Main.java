package lesson8.hw8;
/*Задача №1

Необходимо создать класс Employee со следующими методами:
getBaseSalary - получить базовую ставку
setBaseSalary
getName - получить имя
setName
getSalary - получить зарплату


Задача №2

Необходимо создать класс Worker где метод getSalary будет возвращать базовую ставку.

Необходимо создать класс Manager в который нужно добавить следующие методы:
getNumberOfSubordinates - получить количество подчиненных
setNumberOfSubordinates

 в классе, метод getSalary будет возвращать значение по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 3). Если количество подчиненных 0, то результат как у обычного рабочего.

Необходимо создать класс Director с теми же методами, что и Manager, но метод getSalary должен возвращать результат по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9). Если количество подчиненных 0, то результат как у обычного рабочего.


Задача №3

Необходимо создать утилитарный класс со следующими методами:
поиск сотрудника в массиве по его имени
поиск сотрудника в массиве по вхождению указанной строки в его имени
подсчет зарплатного бюджета для всех сотрудников в массиве
поиск наименьшей зарплаты в массиве
поиск наибольшей зарплаты в массиве
поиск наименьшего количества подчиненных в массиве менеджеров
поиск наибольшего количества подчиненных в массиве менеджеров
поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // get worker's salary
        Worker w1 = new Worker("worker1", 100);
        System.out.println(w1.getSalary());
        System.out.println(w1);
        // get manager's salary
        Manager m1 = new Manager("manager1", 150, 30);
        System.out.println(m1.getSalary());
        // get director's salary
        Director d1 = new Director("director1", 1000, 100);
        System.out.println(d1.getSalary());

        // Declare an array of Employees
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("emp1", 100);
        employees[1] = new Employee("emp2", 200);
        employees[2] = new Employee("emp3", 300);
        employees[3] = new Employee("emp4", 400);
        employees[4] = new Employee("emp5", 500);

        // 1. find an employee among employees by their name
        System.out.println("1. find an employee among employees by their name");
        System.out.println(UtilityClass.getEmployeeByName(employees, "emp3"));

        // 2. find an employee among employees by a substring
        System.out.println("2. find an employee among employees by a substring");
        Employee[] foundEmployeesBySubstring = UtilityClass.getEmployeesBySubstringInName(employees, "mp");
        for (Employee employee : foundEmployeesBySubstring) {
            System.out.println(employee.toString());
        }

        // 3. find budget for all employees
        System.out.println("3. find budget for all employees");
        System.out.println(UtilityClass.getBudgetForAllEmployees(employees));

        // 4. find the highest salary among employees
        System.out.println("4. find the highest salary among employees");
        System.out.println(UtilityClass.getHighestSalaryAmongEmployees(employees));

        // 5. find the lowest salary among employees
        System.out.println("5. find the lowest salary among employees");
        System.out.println(UtilityClass.getLowestSalaryAmongEmployees(employees));

        // Declare an array of Managers
        Manager[] managers = new Manager[5];
        managers[0] = new Manager("emp1", 1000, 0);
        managers[1] = new Manager("emp2", 2000, 10);
        managers[2] = new Manager("emp3", 3000, 1);
        managers[3] = new Manager("emp4", 4000, 15);
        managers[4] = new Manager("emp5", 5000, 30);

        // 6. find the lowest amount of subordinates among managers
        System.out.println("6. find the lowest amount of subordinates among managers");
        System.out.println(UtilityClass.getLowestAmountOfSubordinatesAmongManagers(managers));

        // 7. find the highest amount of subordinates among managers
        System.out.println("7. find the highest amount of subordinates among managers");
        System.out.println(UtilityClass.getHighestAmountOfSubordinatesAmongManagers(managers));

        // 8. find the highest salary bonus among managers
        System.out.println("8. find the highest salary bonus among managers");
        System.out.println(UtilityClass.getHighestSalaryBonusAmongManagers(managers));

        // 9. find the lowest salary bonus among managers
        System.out.println("9. find the lowest salary bonus among managers");
        System.out.println(UtilityClass.getLowestSalaryBonusAmongManagers(managers));
    }
}
