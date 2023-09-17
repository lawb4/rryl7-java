package lesson12.thermostat;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Check Nest Thermostat ===");
        NestThermostat nest = new NestThermostat();
        nest.setTargetTemp(20);
        nest.checkAndAdjust(18);
        nest.checkAndAdjust(22);
        nest.checkAndAdjust(20);
        System.out.println("=== Check Wigwam ===");
        Wigwam wigwam = new Wigwam();
        wigwam.checkAndAdjust(10);
        wigwam.checkAndAdjust(17);
        wigwam.checkAndAdjust(18);
        wigwam.checkAndAdjust(20);
        wigwam.checkAndAdjust(25);
        wigwam.checkAndAdjust(26);
    }
}
