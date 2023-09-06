package lesson8_2;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"1", "second", "3rd", "4rth"};
        printArray(arr);
    }

    // vararg construction
    static void printArray(String... words) {
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
