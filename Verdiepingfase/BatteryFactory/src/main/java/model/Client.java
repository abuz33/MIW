package model;

import model.BatteryFactory;
import model.IBattery;

public class Client {
    private BatteryFactory bf;

    public Client() {
        this.bf = new BatteryFactory();
    }

    public IBattery getRandomBattery() {
        return this.bf.createBattery(Math.random() * 15, Math.random() * 8);
    }
}
