package lesson4.hw;

/*
Задача №8

Дан массив произвольных целых чисел.
    Необходимо подсчитать количество положительных и отрицательных чисел в этом массиве.
*/

public class HW_4_8 {
    public static void main(String[] args) {

        int[] arr = {-45, -65, -34, 65, 0, 1, 78, 143, -69, -65};


        int countPositive = 0;
        int countNegative = 0;
        int countZeroes = 0;

        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            if (elem > 0) {
                countPositive++;
            } else if (elem < 0) {
                countNegative++;
            } else {
                countZeroes++;
            }
        }
        System.out.println("Counter of All values in Array = " + arr.length);
        System.out.println("Counter of Positives = " + countPositive);
        System.out.println("Counter of Negatives = " + countNegative);
        System.out.println("Counter of Zeroes = " + countZeroes);

    }
}
