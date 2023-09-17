package lesson12.vehicles;

public class Train implements Drivable, WithEngine{

    @Override
    public void accelerate() {
        System.out.println("Train Accelerating");
    }

    @Override
    public void stop() {
        System.out.println("Train Stopping");
    }

    @Override
    public void startEngine() {
        System.out.println("Train Engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Train Engine started");
    }
}
