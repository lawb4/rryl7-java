package lesson4.lecture;

public class LR_4_3 {
    public static void main(String[] args) {

        int counter = 0;

        while (counter < 5) {
            System.out.println("counter = " + counter);
            counter++;
        }

        System.out.println();

        // this 'for loop' is equivalent to the above 'while loop'
        for (counter = 0; counter < 5; counter++) {
            System.out.println("counter = " + counter);
        }

        System.out.println();

        counter = 0;
        do {
            System.out.println("counter = " + counter);
            counter++;
        } while (counter < 5);
    }
}
