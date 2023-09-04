package lesson7.hw7_1;

public class Person {
    String name;
    int age;
    boolean sex;

    public String getName() {
        if (sex) {
            return "Mr. " + name;
        } else
            return "Mrs. " + name;
    }
}
