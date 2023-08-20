package lesson4.hw;

/*Задача №2

Необходимо вывести все положительные степени числа 5,
которые меньше 10000,
вывести результат возведения в степень.*/

public class HW_4_2 {
    public static void main(String[] args) {

        int num = 5;
        int result = 1;

        for (int i = 1; result * num < 10000; i++) {
            result *= num;
            System.out.println("num's power = " + i + ", result = " + result);
        }
    }
}
