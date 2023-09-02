package lesson7_2;

public class Main {
    public static void main(String[] args) {
        // Cars
        Car audi = new Car();
        audi.color = "Green";
        audi.maxSpeed = 280;
        audi.model = "A6";
        audi.age = 2;

        Car bmw = new Car("BMW", "black", 1, 300);

        //Cats
        Cat baksik = new Cat("Baksik", 18);
        Cat streetCat = new Cat();
    }
}
