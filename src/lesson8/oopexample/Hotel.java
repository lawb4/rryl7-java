package lesson8.oopexample;

public class Hotel extends Housing {

    String name;
    int singleRooms;
    int doubleRooms;

    public Hotel(int id, String name, int singleRooms, int doubleRooms) {
        super(id);
        this.name = name;
        this.singleRooms = singleRooms;
        this.doubleRooms = doubleRooms;
    }

    @Override
    public int getCapacity() {
        return singleRooms + doubleRooms * 2;
    }

    @Override
    public String getPrintable() {
        return id + ". " + "Hotel " + name + " with capacity of " + getCapacity();
    }
}