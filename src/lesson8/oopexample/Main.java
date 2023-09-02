package lesson8.oopexample;

public class Main {
    public static void main(String[] args) {
//        Hotel tourist = new Hotel();
//        tourist.id = 1;
//        tourist.name = "Турист";
//        tourist.singleRooms = 10;
//        tourist.doubleRooms = 30;
        Hotel tourist = new Hotel(1, "Турист", 10, 30);
        //System.out.println(tourist.name + ": " + tourist.getCapacity());

//        Hotel hilton = new Hotel();
//        hilton.id = 2;
//        hilton.name = "Hilton";
//        hilton.singleRooms = 100;
//        hilton.doubleRooms = 100;
        Hotel hilton = new Hotel(2, "Hilton", 100, 100);

//        House jacksHouse = new House();
//        jacksHouse.id = 15;
//        jacksHouse.ownerName = "Jack";
//        jacksHouse.bedrooms = 10;
        House jacksHouse = new House(15, "Jack", 10);

        System.out.println("Is Jack's house suitable for people? = " + jacksHouse.isSuitableForPeople());

//        Prison singSing = new Prison();
//        singSing.id = 100;
//        singSing.cells = 100;
        Prison singSing = new Prison(100, 100);

        System.out.println("Is SingSing suitable for people? = " + singSing.isSuitableForPeople());

        //System.out.println(hilton.name + ": " + hilton.getCapacity());

        Accommodation accommodation = new Accommodation();
        accommodation.housings = new Housing[]{tourist, hilton, jacksHouse, singSing};
        accommodation.printAll();

        System.out.println(accommodation.totalCapacity());
        //accommodation.printAll();

        System.out.println(accommodation.findForGroup(100).getPrintable());
        System.out.println(accommodation.findForGroup(50).getPrintable());

        // NullPointerException example (groupSize is too big)
        Housing housing = accommodation.findForGroup(500);
        if (housing != null) {
            System.out.println(housing.getPrintable());
        } else {
            System.out.println("No suitable hotel found");
        }
    }
}
