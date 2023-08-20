package lesson4.hw;

/*
Задача №10

Дано положительное целое число n.

создать ряд из n чисел так, чтобы:
первые два элемента ряда равнялись 1
любой другой элемент ряда был суммой двух предыдущих.
Пример:
1, 1, 2, 3, 5, 8, …

Вывести получившийся ряд на экран.
*/

import java.util.Arrays;

public class HW_4_10 {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = new int[n];

        arr[0] = arr[1] = 1;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
