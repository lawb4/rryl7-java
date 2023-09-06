package lesson8.hw8;

import java.util.ArrayList;

public final class EmployeeUtils {
    public static Employee getEmployeeByName(Employee[] employees, String name) {
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                return employee;
            }
        }
        // as of 230905, idk how to correctly bypass the `null` reference
        return null;
    }

    public static Employee[] getEmployeesBySubstringName(Employee[] employees, String substring) {
        ArrayList<Employee> foundEmployeesList = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().contains(substring)) {
                foundEmployeesList.add(employee);
            }
        }
        return foundEmployeesList.toArray(new Employee[0]);
        /*
        The argument `new Employee[0]` is provided as a template array.
        This template array is not used for storing elements but is used
        to determine the type of the resulting array.
        By passing an array of size 0, you're telling Java to create
        a new Employee array of the correct type to hold the elements from the ArrayList
        */
    }

    public static double getBudgetForAllEmployees(Employee[] employees) {
        double totalBudget = 0;
        for (Employee employee : employees) {
            totalBudget += employee.getSalary();
        }
        return totalBudget;
    }

    public static double getHighestSalaryAmongEmployees(Employee[] employees) {
        // assuming the first employee has the highest salary
        double highestSalary = employees[0].getSalary();
        // comparing the salary of the first employee with other employees
        for (Employee employee : employees) {
            double salary = employee.getSalary();
            if (salary > highestSalary) {
                highestSalary = salary;
            }
        }
        return highestSalary;
    }

    public static double getLowestSalaryAmongEmployees(Employee[] employees) {
        // assuming the first employee has the lowest salary
        double lowestSalary = employees[0].getSalary();
        // comparing the salary of the first employee with other employees
        for (Employee employee : employees) {
            double salary = employee.getSalary();
            if (salary < lowestSalary) {
                lowestSalary = salary;
            }
        }
        return lowestSalary;
    }

    public static int getLowestAmountOfSubordinatesAmongManagers(Manager[] managers) {
        // assuming the first manager has the lowest amount of subordinates
        int lowestAmountOfSubordinates = managers[0].getAmountOfSubordinates();
        // comparing the amount of subordinates of the first manager with other managers
        for (Manager manager : managers) {
            int amountOfSubordinates = manager.getAmountOfSubordinates();
            if (amountOfSubordinates < lowestAmountOfSubordinates) {
                lowestAmountOfSubordinates = amountOfSubordinates;
            }
        }
        return lowestAmountOfSubordinates;
    }

    public static int getHighestAmountOfSubordinatesAmongManagers(Manager[] managers) {
        // assuming the first manager has the highest amount of subordinates
        int highestAmountOfSubordinates = managers[0].getAmountOfSubordinates();
        // comparing the amount of subordinates of the first manager with other managers;
        for (Manager manager : managers) {
            int amountOfSubordinates = manager.getAmountOfSubordinates();
            if (amountOfSubordinates > highestAmountOfSubordinates) {
                highestAmountOfSubordinates = amountOfSubordinates;
            }
        }
        return highestAmountOfSubordinates;
    }

    public static double getHighestSalaryBonusAmongManagers(Manager[] managers) {
        // assuming the first manager has the highest bonus
        double highestBonus = managers[0].getSalary();
        // comparing the bonus of the 1st manager with the others'
        for (Manager manager : managers) {
            // it seems `getSalary()` = bonus
            double bonus = manager.getSalary();
            if (highestBonus < bonus) {
                highestBonus = bonus;
            }
        }
        return highestBonus;
    }

    public static double getLowestSalaryBonusAmongManagers(Manager[] managers) {
        // assuming the first manager has the lowest bonus
        double lowestBonus = managers[0].getSalary();
        // comparing the bonus of the 1st manager with the others'
        for (Manager manager : managers) {
            // it seems `getSalary()` = bonus
            double bonus = manager.getSalary();
            if (lowestBonus > bonus) {
                lowestBonus = bonus;
            }
        }
        return lowestBonus;
    }
}
