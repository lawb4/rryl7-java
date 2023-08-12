package lesson2.hw;

// Task Description:
/*
Необходимо создать целочисленные переменные a и b,
присвоить произвольные значения переменным на ваш выбор
и вывести результаты следующих операций с этими переменными:
сложение, умножение, вычитание, деление и остаток от деления.
Также сделать проверку на четность этих переменных и вывести результат.
 */

public class HW_2_1 {
    public static void main(String[] args) {
        int a = 12;
        int b = 3;

        int plus = a + b;
        int minus = a - b;
        int divide = a / b;
        int multiply = a * b;
        int remainder = a % b;

        System.out.println(plus);
        System.out.println(minus);
        System.out.println(divide);
        System.out.println(multiply);
        System.out.println(remainder);

        System.out.println(plus % 2 == 0);
        System.out.println(minus % 2 == 0);
        System.out.println(divide % 2 == 0);
        System.out.println(multiply % 2 == 0);
        System.out.println(remainder % 2 == 0);
    }
}
