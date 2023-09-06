package lesson8.hw8;

public class Director extends Manager {

    public Director(String name, double salary, int amountOfSubordinates) {
        super(name, salary, amountOfSubordinates);
    }

    @Override
    public int getPercentForEachSubordinate() {
        return 9;
    }
    @Override
    public double getSalary() {
        return super.getSalary();
    }
}
