package lesson6.lecture;

// methods

public class LR_6_1 {
    public static void main(String[] args) {
        String s = "yahor";
        int index = s.indexOf('h');
        System.out.println(index); //2

        printText(s);
        printTextCount(s, 3);

        System.out.println(sum(2, 5));
    }

    public static void printText(String text) {
        System.out.println(text);
    }

    public static void printTextCount(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
