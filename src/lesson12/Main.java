package lesson12;

import lesson12.vehicles.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Train train = new Train();
        Bike bike = new Bike();

        Turnable[] turnableVehicles = {car, bike};
        WithEngine[] withEngineVehicles = {car, train};

        for (WithEngine vehicle : withEngineVehicles) {
            vehicle.startEngine();
        }

        System.out.println("=====");

        Object[] vehicles = {car, bike, train};
        for (Object vehicle : vehicles) {
            if (vehicle instanceof WithEngine v) {
                v.startEngine();
            }
        }
    }
}
