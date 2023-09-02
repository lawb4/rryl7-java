package lesson8;

public class ReturnExample {

    public static void addAndPrint(int a, int b) {
        System.out.println(a + b);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        addAndPrint(1,2);
        System.out.println(add(1,2));
    }
}
