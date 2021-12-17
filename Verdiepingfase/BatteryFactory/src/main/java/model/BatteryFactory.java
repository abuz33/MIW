package model;

public class BatteryFactory {


    /* create a battery factory method, which has the following inputs:
    capacity
    voltage
    when capacity is > 10Ah, it is considered a lead car battery
    when capacity is <= 10Ah and voltage is > 5 V , it's a NiMh powertool battery
    when capacity is <= 10Ah and voltage is <= 5 V , it's a Li-ion mobile phone battery
    */

    /**
     * @param capacityInA capacity of the battery
     * @param voltage     voltage of the battery
     * @return IBattery
     * @should return car battery if the capacity above 10Ah
     * @should return Power Tool battery if the capacity below or equal to 10Ah and voltage is above 5V
     * @should return mobile phone battery if the capacity below or equal to 10Ah and voltage is below or equal to 5V
     * @should return null if any of the value is below zero or null
     * Assumptions:
     */
    public IBattery createBattery(double capacityInA, double voltage) {
        if (capacityInA < 0 || voltage < 0) return null;
        if (capacityInA > 10) {
            return new CarBattery(capacityInA, voltage, BatteryTechnology.LEAD);
        } else if (voltage > 5) {
            return new PowerToolBattery(voltage, capacityInA);
        } else {
            return new MobilePhoneBattery(capacityInA, voltage);
        }
    }

}
