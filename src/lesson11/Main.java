package lesson11;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Husky husky = new Husky();
        Manul manul = new Manul();

        Animal[] animals = {cat, dog, husky, manul};
        for (Animal animal : animals) {
            animal.say();
        }

        Dog[] dogs = {dog, husky};
        for (Dog dog1 : dogs) {
            dog1.bark();
        }

        cat.jump();
        new Manul().jump();
    }
}
