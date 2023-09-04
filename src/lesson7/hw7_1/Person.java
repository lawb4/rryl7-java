package lesson7.hw7_1;

public class Person {
    String name;
    int age;

    boolean sex; // true = male, false = female

    public String getName() {
        if (sex) {
            return "Mr. " + name;
        } else {
            return "Mrs. " + name;
        }

        /*
        2nd way with ternary operator

        String prefix = sex ? "Mr" : "Mrs";
        return prefix + ". " + name;
        */
    }
}
