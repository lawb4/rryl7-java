package lesson8.hw8;

public class Worker extends Employee {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getSalary() {
        return super.getBaseSalary();
    }
}
