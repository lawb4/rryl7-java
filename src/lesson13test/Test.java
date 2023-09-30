package lesson13test;

public class Test {

    public static void main(String[] args) {
        System.out.println(sum(1, 5));
        testSum();
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void testSum() {
        int result1 = sum(0, 0);
        System.out.println(result1 == 0);

        int result2 = sum(5, 8);
        System.out.println(result2 == 13);

        int result3 = sum(-5, 8);
        System.out.println(result3 == 3);

        int result4 = sum(Integer.MAX_VALUE, 1);
        System.out.println(result4 == Integer.MIN_VALUE);
    }
}
