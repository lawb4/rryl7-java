package lesson11;

public class Dog extends Animal {
    public Dog() {
        super("Cобака");
    }

    protected Dog(String name) {
        super(name);
    }

    public void say() {
        System.out.println(name + " говорит Гав-гав!");
    }

    public void bark() {
        say();
    }
}
