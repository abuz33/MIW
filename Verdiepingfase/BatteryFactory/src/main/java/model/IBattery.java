package model;

public interface IBattery {
    double getCapacityInmAh();

    double getVoltageInVolt();

    BatteryTechnology getBatteryTechnology();
}
