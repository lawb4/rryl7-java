package lesson12.thermostat;

public class NestThermostat extends AbstractThermostat {

    int targetTemp;

    public void setTargetTemp(int targetTemp) {
        this.targetTemp = targetTemp;
    }

    public int getTargetTemp() {
        return targetTemp;
    }

    @Override
    protected boolean tooCold(int currentTemp) {
        return currentTemp < getTargetTemp();
    }

    @Override
    protected void sleep() {
        System.out.println("Nest is sleeping and sending your info to Google");
    }

    @Override
    protected void increaseTemp() {
        System.out.println("Turn on heat");
    }

    @Override
    protected void decreaseTemp() {
        System.out.println("Turn on Air Conditioner");
    }

    @Override
    protected boolean tooHot(int currentTemp) {
        return currentTemp > getTargetTemp();
    }
}
