package lesson8.oopexample;

public abstract class Housing {
    public int id;

    public Housing(int id) {
        this.id = id;
    }
    public abstract int getCapacity();
    public abstract String getPrintable();

    public boolean isSuitableForPeople() {
        return true;
    }
}
