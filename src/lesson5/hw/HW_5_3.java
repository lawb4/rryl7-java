package lesson5.hw;

/*
Задача №3

Дана строка:
String s = “Посмотрите как Рите нравится ритм”;
необходимо вывести индексы начала всех подстрок - “рит”,
    независимо от регистра.
Для указанной строки ответ будет 6, 15, 29.
*/

public class HW_5_3 {
    public static void main(String[] args) {
        String s = "Посмотрите как Рите нравится ритм";

        // kostyl
        boolean condition = true;
        for (int i = 0; i < s.length(); i++) {
            condition = s.toLowerCase().charAt(i) == 'р'
                    && s.toLowerCase().charAt(i + 1) == 'и'
                    && s.toLowerCase().charAt(i + 2) == 'т';
            if (condition) {
                System.out.print(i + " ");
            }
        }
        // stub for 2nd variant (waiting for hw review)
        // s.toLowerCase().contains("рит")) {
    }
}
