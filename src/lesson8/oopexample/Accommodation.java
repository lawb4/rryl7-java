package lesson8.oopexample;

public class Accommodation {

    Housing[] housings;

    public int totalCapacity() {
        int sum = 0;
        for (Housing h : housings) {
            sum += h.getCapacity();
        }
        return sum;
    }

    public void printAll() {
        System.out.println("All housings:");
        for (Housing h : housings) {
            System.out.println(h.getPrintable());
        }
    }

    public Housing findForGroup(int groupSize) {
        for (Housing h : housings) {
            if (h.getCapacity() >= groupSize) {
                return h;
            }
        }
        return null;
    }
}
