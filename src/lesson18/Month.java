package lesson18;

public enum Month {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(30),
    NOVEMBER(30),
    DECEMBER(31);

    private final int numOfDays;

    Month(int numOfDays) {
        this.numOfDays = numOfDays;
    }

    public int getNumOfDays() {
        return numOfDays;
    }
}
