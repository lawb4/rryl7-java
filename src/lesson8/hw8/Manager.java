package lesson8.hw8;

public class Manager extends Employee {
    private int amountOfSubordinates;

    public Manager(String name, double salary, int amountOfSubordinates) {
        super(name, salary);
        this.amountOfSubordinates = amountOfSubordinates;
    }

    public int getPercentForEachSubordinate() {
        return 3;
    }

    public void setAmountOfSubordinates(int amountOfSubordinates) {
        this.amountOfSubordinates = amountOfSubordinates;
    }

    public int getAmountOfSubordinates() {
        return this.amountOfSubordinates;
    }

    @Override
    public double getSalary() {
        if (getAmountOfSubordinates() == 0) {
            return super.getBaseSalary();
        }
        // get 3% bonus for every subordinate
        double bonusFormula = (double) amountOfSubordinates / 100 * getPercentForEachSubordinate();
        return super.getBaseSalary() * bonusFormula;
    }
}
