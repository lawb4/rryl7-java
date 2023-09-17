package lesson12.thermostat;

public abstract class AbstractThermostat {

    final void checkAndAdjust(int currentTemp) {
        if (tooHot(currentTemp)) {
            decreaseTemp();
        } else if (tooCold(currentTemp)) {
            increaseTemp();
        } else {
            sleep();
        }
    }

    protected abstract boolean tooCold(int currentTemp);

    protected abstract void sleep();

    protected abstract void increaseTemp();

    protected abstract void decreaseTemp();

    protected abstract boolean tooHot(int currentTemp);
}
