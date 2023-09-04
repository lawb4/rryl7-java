package lesson8.hw8;

public class Director extends Manager {

    public Director(String name, double salary, int amountOfSubordinates) {
        super(name, salary, amountOfSubordinates);
    }

    @Override
    public double getSalary() {
        if (getAmountOfSubordinates() == 0) {
            return super.getSalary();
        }
        return super.getSalary() * ((double) getAmountOfSubordinates() / 100 * 9);
    }
}
