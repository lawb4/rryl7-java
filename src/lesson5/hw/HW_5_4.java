package lesson5.hw;

/*
Экстра задача

Дан массив:
String[][] array =
    {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
*/

public class HW_5_4 {
    public static void main(String[] args) {
        String[][] array = {{"Привет", "всем", "кто" },
                {"изучает", "язык", "программирования" },
                {"java" }};

        //String finalSentence = ""; // redundant func to output the words to console

        int counter = 0;
        for (String[] subArray : array) {
            for (String word : subArray) {
                if (!word.contains("е")) {
                    counter++;
                    //finalSentence += word + " ";
                }
            }
        }
        System.out.println("count = " + counter);
        //System.out.println("The words are = " + finalSentence);
    }
}
