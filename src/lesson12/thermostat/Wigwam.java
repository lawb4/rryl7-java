package lesson12.thermostat;

public class Wigwam extends AbstractThermostat {
    @Override
    protected boolean tooCold(int currentTemp) {
        return currentTemp < 18;
    }

    @Override
    protected void sleep() {
        System.out.println("Сидим тихо, поем песни");
    }

    @Override
    protected void increaseTemp() {
        System.out.println("Подкинуть дров в костер");
    }

    @Override
    protected void decreaseTemp() {
        System.out.println("Открыть полог");
    }

    @Override
    protected boolean tooHot(int currentTemp) {
        return currentTemp > 25;
    }
}
