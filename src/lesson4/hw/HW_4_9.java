package lesson4.hw;

/*
Задача №9

Дан массив произвольных целых чисел.
        проверить, отсортирован ли он,
        т.е. все ли числа в массиве стоят так,
        что каждое следующее число больше предыдущего.
*/

public class HW_4_9 {
    public static void main(String[] args) {

        int[] arr = {-75, -65, -34, 65, 0, 1, 78, 143, -69, -65};
        // init a boolean to store the decision value
        boolean isSorted = false;

        // checking algorithm
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] <= arr[i]) {
                isSorted = true;
            } else {
                isSorted = false;
                break;
            }
        }

        // output a string value depending on the boolean value
        System.out.println("Is the Array sorted ASC? > " + isSorted);
    }
}
