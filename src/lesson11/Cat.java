package lesson11;

public class Cat extends Animal {
    public Cat() {
        super("Кошка");
    }

    protected Cat(String name) {
        super(name);
    }

    public void say() {
        System.out.println(name + " говорит Мяу-мяу!");
    }

    public void jump() {
        System.out.println(name + " прыгнула выше головы");
    }
}
