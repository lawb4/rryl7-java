package lesson14_1;

public class Main {
    public static void main(String[] args) {
        Car car = new Tesla();
        car.setSpeed(100);

        Plane plane = new Plane();
        plane.setSpeed(600);

        HasSpeed[] arr = new HasSpeed[]{car, plane};

        for (HasSpeed obj : arr) {
            System.out.println(obj.getSpeed());
        }
    }
}

abstract class Car implements HasSpeed {
    private int speed;

    @Override
    public int getSpeed() {
        return speed;
    }

    void setSpeed(int newSpeed) {
        if (newSpeed > 0 && newSpeed < 200) {
            this.speed = newSpeed;
        }
    }
}

class BMW extends Car {

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }
}

class Tesla extends Car {

    @Override
    public int getSpeed() {
        return super.getSpeed() + 10;
    }
}

class Plane implements HasSpeed {
    private int speed;

    @Override
    public int getSpeed() {
        return speed;
    }

    void setSpeed(int newSpeed) {
        if (newSpeed > 200 && newSpeed < 1200) {
            this.speed = newSpeed;
        }
    }
}

interface HasSpeed {
    int getSpeed();
}
