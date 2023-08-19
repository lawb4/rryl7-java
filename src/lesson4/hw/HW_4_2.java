package lesson4.hw;

/*Задача №2

Необходимо вывести все положительные степени числа 5,
которые меньше 10000,
вывести результат возведения в степень.*/

public class HW_4_2 {
    public static void main(String[] args) {

        int num = 5;
        int result = 1;

        do {
            result *= num;
            System.out.println(result);
        } while (result < 10000);
    }
}
