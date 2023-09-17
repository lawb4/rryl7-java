package lesson12.vehicles;

public class Car implements Drivable, Turnable, WithEngine {

    public void startEngine() {
        System.out.println("Car Engine started");
    }

    public void stopEngine() {
        System.out.println("Car Engine stopping");
    }

    public void accelerate() {
        System.out.println("Car Accelerating");
    }

    public void stop() {
        System.out.println("Car stopping");
    }

    public void turnLeft() {
        System.out.println("Car turns left");
    }

    public void turnRight() {
        System.out.println("Car turns right");
    }
}
