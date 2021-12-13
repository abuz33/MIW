package model;

import java.util.Objects;

public class CarBattery implements IBattery {
    private final double capacityInAh;
    private final double voltage;
    private final BatteryTechnology batteryTechnology;

    public CarBattery(double capacityInAh, double voltage, BatteryTechnology batteryTechnology) {
        this.capacityInAh = capacityInAh;
        this.voltage = voltage;
        this.batteryTechnology = batteryTechnology;
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
        return "CarBattery{" +
                "capacityInAh=" + capacityInAh +
                ", voltage=" + voltage +
                ", batteryTechnology=" + batteryTechnology +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarBattery that = (CarBattery) o;
        return Double.compare(that.capacityInAh, capacityInAh) == 0 && Double.compare(that.voltage, voltage) == 0 && batteryTechnology == that.batteryTechnology;
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacityInAh, voltage, batteryTechnology);
    }
}
