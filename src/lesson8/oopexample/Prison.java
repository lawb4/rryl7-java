package lesson8.oopexample;

public class Prison extends Housing {

    int cells;

    public Prison(int id, int cells) {
        super(id);
        this.cells = cells;
    }

    @Override
    public int getCapacity() {
        return cells;
    }

    @Override
    public String getPrintable() {
        return id + ". " + "It's a prison for " + getCapacity() + " prisoners";
    }

    @Override
    public boolean isSuitableForPeople() {
        return false;
    }
}