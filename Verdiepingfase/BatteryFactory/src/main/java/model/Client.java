package model;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private final BatteryFactory batteryFactory;
    private final ScreenFactory schermFactory;
    private IFactory factory;

    public Client() {
        this.batteryFactory = new BatteryFactory();
        this.schermFactory = new ScreenFactory();
    }

    public IBattery getRandomBattery() {
        return this.batteryFactory.createBattery(Math.random() * 15, Math.random() * 8);
    }

    public void makeCar() {
        List<Object> carItems = new ArrayList<>();
        IBattery gemaaktBatterij = batteryFactory.createBattery(2, 2);
        IScreen gemaaktScree = schermFactory.createScherm();
    }

    public void makeACar() {
        this.factory = new CarFactory();
        this.factory.getBattery();
        this.factory.getScreen();
    }

    public void make(FactoryType type) {
        if (type == FactoryType.CAR) {
            this.factory = new CarFactory();
        } else if (type == FactoryType.PHONE) {
            this.factory = new PhoneFactory();
        } else if (type == FactoryType.POWERTOOL) {
            this.factory = new PowerToolFactory();
        }

        this.factory.getBattery();
        this.factory.getScreen();
    }
}
