package lesson4.lecture;

import java.util.Arrays;

public class LR_4_2 {
    public static void main(String[] args) {

        int[] scoreMarks = new int[]{5, 5, 5, 5, 4, 3, 3, 2, 1, 3, 5, 5};
        System.out.println(scoreMarks[7]); // 2

        scoreMarks[7] = 4; // reassign a value in array
        scoreMarks[9] = 4; // reassign a value in array
        System.out.println(Arrays.toString(scoreMarks));
        // [5, 5, 5, 5, 4, 3, 3, 4, 4, 3, 5, 5]

        // output values from array using for loop
        for (int i = 0; i < scoreMarks.length; i++) {
            int score = scoreMarks[i];
            // if mark < 4, add 1 point to each mark
            if (score < 4) {
                scoreMarks[i] = ++score;
            }
        }
        System.out.println(Arrays.toString(scoreMarks));

        // find average mark
        int sumOfMarks = 0;
        for (int i = 0; i < scoreMarks.length; i++) {
            sumOfMarks += scoreMarks[i];
        }
        System.out.println("The average mark = "
                + (double) sumOfMarks / scoreMarks.length);

        // find the smallest mark
        int min = Integer.MAX_VALUE; // init a value for comparison
        for (int i = 0; i < scoreMarks.length; i++) {
            int num = scoreMarks[i];
            if (num < min) {
                min = num;
            }
        }
        System.out.println("The smallest mark = " + min);

        // find the biggest mark
        int max = Integer.MIN_VALUE; // init a value for comparison
        for (int i = 0; i < scoreMarks.length; i++) {
            int num = scoreMarks[i];
            if (num > max) {
                max = num;
            }
        }
        System.out.println("The biggest mark = " + max);

        // output an array which values are x2 of the initial values
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] results = new int[arr.length]; // init a new array to store new values

        for (int i = 0; i < arr.length; i++) {
            int newValue = arr[i];
            results[i] = newValue * newValue;
        }
        System.out.println("The new array with x2 values = "
                + Arrays.toString(results));
    }
}
