package lesson8.oopexample;

public class House extends Housing {

    String ownerName;
    int bedrooms;

    public House(int id, String ownerName, int bedrooms) {
        super(id);
        this.ownerName = ownerName;
        this.bedrooms = bedrooms;
    }

    @Override
    public int getCapacity() {
        return bedrooms * 2;
    }

    @Override
    public String getPrintable() {
        return id + ". " + ownerName + "'s house with capacity of " + bedrooms;
    }
}
