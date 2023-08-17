package lesson3.lecture;

public class LR_3 {
    public static void main(String[] args) {

        // if, if-else
        int maxAge = 100;
        int minAge = 18;
        int myAge = 24;

        System.out.println("Are you at least" + minAge + " or younger than " + maxAge + "?");

        if (myAge >= minAge && myAge < maxAge) {
            System.out.println("Approved");
        } else {
            System.out.println("Denied");
        }

        // for loop
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("loop is finished");
    }
}
