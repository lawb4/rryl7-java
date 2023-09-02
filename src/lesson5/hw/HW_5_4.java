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

        // 1st variant with enhanced for
        int counter = 0;
        for (String[] subArray : array) {
            for (String word : subArray) {
                if (!word.contains("е")) { // cyrillic `е`
                    counter++;
                    //finalSentence += word + " ";
                }
            }
        }
        System.out.println("counter = " + counter);
        //System.out.println("The words are = " + finalSentence);

        // 2nd variant with `normal` for
        int counter1 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!array[i][j].contains("е")) { // cyrillic `е`
                    counter1++;
                }
            }
        }
        System.out.println("counter1 = " + counter1);
    }
}
