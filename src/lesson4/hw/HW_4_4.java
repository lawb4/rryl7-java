package lesson4.hw;

/*
Задача №4

Дан массив:
   int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
   необходимо вывести сумму всех значений массива.
*/

public class HW_4_4 {
    public static void main(String[] args) {

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
