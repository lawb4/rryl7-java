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

        int[] arr = {-45, -65, -34, 65, 0, 1, 78, 143, -69, -65};

        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println(temp);
        }
    }
}
