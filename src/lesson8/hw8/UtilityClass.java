package lesson8.hw8;

import java.util.ArrayList;

public final class UtilityClass {
    private static final double ZERO_BONUS = 0;
    public static Employee getEmployeeByName(Employee[] employees, String name) {
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                return employee;
            }
        }
        // as of today, idk how to correctly bypass the `null` reference
        return null;
    }

    public static Employee[] getEmployeesBySubstringInName(Employee[] employees, String substring) {
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
            if (highestSalary < employee.getSalary()) {
                highestSalary = employee.getSalary();
            }
        }
        return highestSalary;
    }

    public static double getLowestSalaryAmongEmployees(Employee[] employees) {
        // assuming the first employee has the lowest salary
        double lowestSalary = employees[0].getSalary();
        // comparing the salary of the first employee with other employees
        for (Employee employee : employees) {
            if (lowestSalary > employee.getSalary()) {
                lowestSalary = employee.getSalary();
            }
        }
        return lowestSalary;
    }

    public static int getLowestAmountOfSubordinatesAmongManagers(Manager[] managers) {
        // assuming the first manager has the lowest amount of subordinates
        int lowestAmountOfSubordinates = managers[0].getAmountOfSubordinates();
        // comparing the amount of subordinates of the first manager with other managers
        for (Manager manager : managers) {
            if (lowestAmountOfSubordinates > manager.getAmountOfSubordinates()) {
                lowestAmountOfSubordinates = manager.getAmountOfSubordinates();
            }
        }
        return lowestAmountOfSubordinates;
    }

    public static int getHighestAmountOfSubordinatesAmongManagers(Manager[] managers) {
        // assuming the first manager has the highest amount of subordinates
        int highestAmountOfSubordinates = managers[0].getAmountOfSubordinates();
        // comparing the amount of subordinates of the first manager with other managers;
        for (Manager manager : managers) {
            if (highestAmountOfSubordinates < manager.getAmountOfSubordinates()) {
                highestAmountOfSubordinates = manager.getAmountOfSubordinates();
            }
        }
        return highestAmountOfSubordinates;
    }

    public static double getHighestSalaryBonusAmongManagers(Manager[] managers) {
        double highestBonusAmount = ZERO_BONUS;
        for (Manager manager : managers) {
            double bonusAmount = manager.getBaseSalary() - manager.getSalary();
            if (highestBonusAmount < bonusAmount) {
                highestBonusAmount = bonusAmount;
            }
        }
        return highestBonusAmount;
    }

    public static double getLowestSalaryBonusAmongManagers(Manager[] managers) {
        double lowestBonusAmount = ZERO_BONUS;
        for (Manager manager : managers) {
            double bonusAmount = manager.getBaseSalary() - manager.getSalary();
            if (lowestBonusAmount > bonusAmount) {
                lowestBonusAmount = bonusAmount;
            }
        }
        return lowestBonusAmount;
    }
}
