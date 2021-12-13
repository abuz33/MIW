package model;

import java.util.Objects;

public class PowerToolBattery implements IBattery {
    private final double voltage;
    private final double capacityInAh;
    private final BatteryTechnology batteryTechnology = BatteryTechnology.NIMH;

    public PowerToolBattery(double voltage, double capacityInAh) {
        this.voltage = voltage;
        this.capacityInAh = capacityInAh;
    }

    @Override
    public double getCapacityInmAh() {
        return capacityInAh;
    }

    @Override
    public double getVoltageInVolt() {
        return voltage;
    }

    @Override
    public BatteryTechnology getBatteryTechnology() {
        return batteryTechnology;
    }

    @Override
    public String toString() {
        return "PowerToolBattery{" +
                "voltage=" + voltage +
                ", capacityInAh=" + capacityInAh +
                ", batteryTechnology=" + batteryTechnology +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PowerToolBattery that = (PowerToolBattery) o;
        return voltage == that.voltage && capacityInAh == that.capacityInAh && batteryTechnology == that.batteryTechnology;
    }

    @Override
    public int hashCode() {
        return Objects.hash(voltage, capacityInAh, batteryTechnology);
    }
}
