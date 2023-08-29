package lesson5.hw;

/*
Задача №2

Дана строка:
String s = “Перевыборы выбранного президента”;
необходимо подсчитать количество букв “е” в строке.

Для указанной строки ответ будет 4.
*/

public class HW_5_2 {
    public static void main(String[] args) {
        String s = "Перевыборы выбранного президента";
        int charCounter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'е') {
                charCounter++;
            }
        }
        System.out.println(charCounter);
    }
}
