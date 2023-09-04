package lesson8.hw8;

public class Manager extends Employee {
    private int amountOfSubordinates;

    public Manager(String name, double salary, int amountOfSubordinates) {
        super(name, salary);
        this.amountOfSubordinates = amountOfSubordinates;
    }

    public void setAmountOfSubordinates(int amountOfSubordinates) {
        this.amountOfSubordinates = amountOfSubordinates;
    }

    public int getAmountOfSubordinates() {
        return amountOfSubordinates;
    }

    @Override
    public double getSalary() {
        if (getAmountOfSubordinates() == 0) {
            return super.getSalary();
        }
        return super.getBaseSalary() * getAmountOfSubordinates() / 100 * 3;
        // 230904 idu why the below line of code is not considered the same as the above
        //return super.getBaseSalary() * ((double) getAmountOfSubordinates() / 100 * 3);
    }
}
