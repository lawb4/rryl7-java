package lesson4.lecture;

public class LR_4_4_GuessNum {
    public static void main(String[] args) {

        int min = 0;
        int max = 100;
        int myNumber = 15;

        int guess;
        // using `do while` because at least one `guess` is required
        do {
            guess = (min + max) / 2;
            System.out.println("I'm guessing " + guess);

            if (guess < myNumber) {
                min = guess;
            } else {
                max = guess;
            }
        } while (guess != myNumber);
    }
}
