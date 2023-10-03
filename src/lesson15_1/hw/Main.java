package lesson15_1.hw;

/*
Вывести на экран следующую последовательность чисел: 1,2,4,8,16...,
где каждое следующее число вдвое больше предыдущего
*/


public class Main {
    public static void main(String[] args) {
        int size = 10;
        int num = 1;

        for (int i = 1; i <= size; i++) {
            System.out.print(num + " ");
            num *= 2;
        }
    }
}
