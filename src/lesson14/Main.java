package lesson14;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Yegor", 24);
        person.setName("Yahor");

        IName iName = new Person("Yahor", 24);
        iName.getName();

        Pet pet = new Pet("dog", "Lucy");

        printName(person);
        printName(pet);
    }

    public static void printName(IName named) {
        System.out.println(named.getName());
    }
}
