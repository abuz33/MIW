package model;

import java.util.Objects;

public class MobilePhoneBattery implements IBattery {
    private final double capacityInmAh;
    private final double voltageInVolt;
    private final BatteryTechnology batteryTechnology = BatteryTechnology.LIION;

    public MobilePhoneBattery(double capacityInAh, double voltageInVolt) {
        this.capacityInmAh = capacityInAh * 1000;
        this.voltageInVolt = voltageInVolt;
    }


    @Override
    public double getCapacityInmAh() {
        return capacityInmAh;
    }

    @Override
    public double getVoltageInVolt() {
        return voltageInVolt;
    }

    @Override
    public BatteryTechnology getBatteryTechnology() {
        return batteryTechnology;
    }

    @Override
    public String toString() {
        return "MobilePhoneBattery{" +
                "capacityInmAh=" + capacityInmAh +
                ", voltageInVolt=" + voltageInVolt +
                ", batteryTechnology=" + batteryTechnology +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MobilePhoneBattery that = (MobilePhoneBattery) o;
        return capacityInmAh == that.capacityInmAh && Double.compare(that.voltageInVolt, voltageInVolt) == 0 && batteryTechnology == that.batteryTechnology;
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacityInmAh, voltageInVolt, batteryTechnology);
    }
}
